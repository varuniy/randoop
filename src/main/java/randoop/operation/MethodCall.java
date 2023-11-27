package randoop.operation;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
import org.plumelib.util.StringsPlume;
import randoop.ExceptionalExecution;
import randoop.ExecutionOutcome;
import randoop.Globals;
import randoop.NormalExecution;
import randoop.reflection.AccessibilityPredicate;
import randoop.reflection.ReflectionPredicate;
import randoop.sequence.Variable;
import randoop.types.Type;
import randoop.types.TypeTuple;
import randoop.util.Log;
import randoop.util.MethodReflectionCode;
import randoop.util.ReflectionExecutor;

/**
 * MethodCall is a {@link Operation} that represents a call to a method. It is a wrapper for a
 * reflective Method object, and caches values of computed reflective calls.
 *
 * <p>An an {@link Operation}, a call to a non-static method<br>
 * {@code T mname (T1,...,Tn)}<br>
 * of class C can be represented formally as an operation<br>
 * <i>mname</i>: [<i>C, T1,...,Tn</i>] &rarr; <i>T</i>.<br>
 * If this method is static, then we could write the operation as<br>
 * <i>C.mname</i>: [<i>T1,...,Tn</i>] &rarr; <i>T</i><br>
 * (a class instance not being needed as an input).
 *
 * <p>The execution of a {@code MethodCall} executes the enclosed {@link Method} given values for
 * the inputs.
 *
 * <p>(Class previously called RMethod.)
 */
public final class MethodCall extends CallableOperation {

  /** The method that is called by this MethodCall. */
  private final Method method;

  /** True if the method is static. */
  private final boolean isStatic;

  /** True if the method is accessible. */
  private boolean isAccessible;

  /**
   * getMethod returns Method object of this MethodCall.
   *
   * @return {@link Method} object called by this {@link MethodCall}
   */
  public Method getMethod() {
    return this.method;
  }

  /**
   * MethodCall creates an object corresponding to the given reflective method.
   *
   * @param method the reflective method object
   * @param isAccessible boolean indicating if the method is accessible
   */
  public MethodCall(Method method, boolean isAccessible) {
    if (method == null) {
      throw new IllegalArgumentException("method should not be null.");
    }

    this.method = method;
    this.isStatic = Modifier.isStatic(method.getModifiers() & Modifier.methodModifiers());
    this.isAccessible = isAccessible;
  }

  /**
   * toString outputs a text representation of the method call.
   *
   * @return string representation of the enclosed method
   */
  @Override
  public String toString() {
    return method.toString();
  }

  /**
   * {@inheritDoc}
   *
   * <p>Issues the code that corresponds to calling the method with the provided {@link Variable}
   * objects as arguments.
   *
   * @param inputVars is the list of actual arguments to be printed
   */
  @Override
  public void appendCode(
      Type declaringType,
      TypeTuple inputTypes,
      Type outputType,
      List<Variable> inputVars,
      StringBuilder sb) {

    // The name of the method.
    String methodName = getMethod().getName();
    // The name of a variable (in the test that Randoop outputs) that holds the Method object.
    String methodVar = getVariableNameForMethodObject();

    if (!isAccessible) {
      if (!Globals.makeAccessibleCode.containsKey(methodVar)) {
        String line1 =
            methodVar
                + " = "
                + getMethod().getDeclaringClass().getCanonicalName().replace('$', '.')
                + ".class.getDeclaredMethod";
        StringJoiner args = new StringJoiner(", ", "(", ")");
        args.add("\"" + methodName + "\"");
        for (Class<?> parameterType : getMethod().getParameterTypes()) {
          args.add(parameterType.getCanonicalName().replace('$', '.') + ".class");
        }
        line1 += args.toString() + ";";
        String line2 = methodVar + ".setAccessible(true);";
        String lineSep = System.lineSeparator();
        Globals.makeAccessibleCode.put(methodVar, line1 + lineSep + line2 + lineSep);
      }
    }

    String receiverVar = isStatic() ? null : inputVars.get(0).getName();
    if (isAccessible) {
      if (isStatic()) {
        // In the generated Java code, the "receiver" (before the method name) is the class name.
        sb.append(declaringType.getCanonicalName().replace('$', '.'));
      } else {
        // In this branch, isAcessible == false.
        // In the generated Java code, the receiver is an expression.
        Type receiverFormalType = inputTypes.get(0);
        if (receiverFormalType.isPrimitive()) {
          sb.append("((")
              .append(receiverFormalType.getFqName())
              .append(")")
              .append(receiverVar)
              .append(")");
        } else {
          sb.append(receiverVar);
        }
      }

      sb.append(".");
      sb.append(methodName);
    } else {
      if (!outputType.isVoid()) {
        // Cast because the return type of `invoke()` is Object.
        sb.append("(").append(outputType.getFqName()).append(") ");
      }
      sb.append(methodVar).append(".").append("invoke");
    }

    StringJoiner arguments = new StringJoiner(", ", "(", ")");
    // In a reflective call, a receiver is always passed (even if it's null).
    int startIndex = !isAccessible || isStatic() ? 0 : 1;
    for (int i = startIndex; i < inputVars.size(); i++) {
      if (i == 0 && !isAccessible && isStatic()) {
        // There is no harm to passing inputVars.get(0), but pass
        // null to emphasize that the first (receiver) argument is ignored.
        sb.append("null");
      } else {
        // CASTING.
        String cast;
        if (inputVars.get(i).getType().equals(inputTypes.get(i))) {
          cast = "";
        } else {
          // Cast if the argument and formal parameter types are not identical.
          cast = "(" + inputTypes.get(i).getFqName() + ") ";
        }
        String param = getArgumentString(inputVars.get(i));
        arguments.add(cast + param);
      }
    }
    sb.append(arguments.toString());
  }

  /**
   * Constructs a unique variable name for the method object associated with this {@link
   * MethodCall}. The variable name is formed by appending the method name and the simple names of
   * the parameter types, separated by underscores. For array types, "Array" is appended instead of
   * "[]".
   *
   * @return the unique variable name
   */
  private String getVariableNameForMethodObject() {
    StringBuilder signature = new StringBuilder();
    // Append method name
    signature.append(getMethod().getName());
    // Append parameter types
    Class<?>[] parameterTypes = getMethod().getParameterTypes();
    for (int i = 0; i < parameterTypes.length; i++) {
      signature.append("_");
      signature.append(parameterTypes[i].getSimpleName().replace("[]", "Array"));
    }
    return signature.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof MethodCall)) {
      return false;
    }
    MethodCall other = (MethodCall) o;
    return this.method.equals(other.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method);
  }

  /**
   * {@inheritDoc}
   *
   * @return a {@link NormalExecution} with return value if execution was normal, otherwise a {@link
   *     ExceptionalExecution} if an exception was thrown
   */
  @Override
  public ExecutionOutcome execute(Object[] input) {

    Log.logPrintf("MethodCall.execute: this = %s%n", this);

    Object receiver = null;
    int paramsLength = input.length;
    int paramsStartIndex = 0;
    if (!isStatic()) {
      receiver = input[0];
      paramsLength--;
      paramsStartIndex = 1;
    }

    Object[] params = new Object[paramsLength];
    for (int i = 0; i < params.length; i++) {
      params[i] = input[i + paramsStartIndex];
      if (Log.isLoggingOn()) {
        Log.logPrintf("  Param %d = %s%n", i, StringsPlume.toStringAndClass(params[i]));
      }
    }

    MethodReflectionCode code = new MethodReflectionCode(this.method, receiver, params);

    return ReflectionExecutor.executeReflectionCode(code);
  }

  /**
   * {@inheritDoc}
   *
   * @return true if this method is static, and false otherwise
   */
  @Override
  public boolean isStatic() {
    return isStatic;
  }

  /**
   * {@inheritDoc}
   *
   * <p>The descriptor for a method is a string representing the method signature.
   *
   * <p>Examples: java.util.ArrayList.get(int) java.util.ArrayList.add(int,java.lang.Object)
   */
  @Override
  public String toParsableString(Type declaringType, TypeTuple inputTypes, Type outputType) {
    StringBuilder sb = new StringBuilder();
    sb.append(method.getDeclaringClass().getName()).append(".");
    sb.append(method.getName()).append("(");
    Class<?>[] params = method.getParameterTypes();
    TypeArguments.getTypeArgumentString(sb, params);
    sb.append(")");
    return sb.toString();
  }

  /**
   * Parses a method signature (<em>not</em> a representation of a call; there are no arguments, for
   * example) and returns a {@link MethodCall} object. Should satisfy {@code
   * parse(op.toParsableString()).equals(op)} for Operation op.
   *
   * @param signature a string descriptor
   * @return the method call operation for the given string descriptor
   * @throws OperationParseException if s does not match expected descriptor
   * @see OperationParser#parse(String)
   */
  @SuppressWarnings("signature") // parsing
  public static TypedClassOperation parse(String signature) throws OperationParseException {
    if (signature == null) {
      throw new IllegalArgumentException("signature may not be null");
    }

    int openParPos = signature.indexOf('(');
    int closeParPos = signature.indexOf(')');

    String prefix = signature.substring(0, openParPos);
    int lastDotPos = prefix.lastIndexOf('.');

    assert lastDotPos >= 0;
    String classname = prefix.substring(0, lastDotPos);
    String opname = prefix.substring(lastDotPos + 1);
    String arguments = signature.substring(openParPos + 1, closeParPos);

    Type classType;
    try {
      classType = Type.getTypeforFullyQualifiedName(classname);
    } catch (ClassNotFoundException | NoClassDefFoundError e) {
      String msg =
          "Class " + classname + " is not on classpath while parsing \"" + signature + "\"";
      throw new OperationParseException(msg);
    }

    Class<?>[] typeArguments;
    try {
      typeArguments = TypeArguments.getTypeArgumentsForString(arguments);
    } catch (OperationParseException e) {
      throw new OperationParseException(e.getMessage() + " while parsing \"" + signature + "\"");
    }
    Method m = null;
    try {
      m = classType.getRuntimeClass().getDeclaredMethod(opname, typeArguments);
    } catch (NoSuchMethodException e) {
      try {
        m = classType.getRuntimeClass().getMethod(opname, typeArguments);
      } catch (NoSuchMethodException e2) {
        String msg =
            "Method "
                + opname
                + " with parameters "
                + Arrays.toString(typeArguments)
                + " does not exist in "
                + classType
                + ": "
                + e;
        throw new OperationParseException(msg);
      }
    }
    // accessibility predicate shouldn't matter for generating output type
    return TypedClassOperation.forMethod(m, AccessibilityPredicate.IS_ANY);
  }

  /**
   * {@inheritDoc}
   *
   * @return true always, since this is a method call
   */
  @Override
  public boolean isMessage() {
    return true;
  }

  /**
   * {@inheritDoc}
   *
   * @return true always, since this is a method call
   */
  @Override
  public boolean isMethodCall() {
    return true;
  }

  @Override
  public String getName() {
    return method.getName();
  }

  @Override
  public Method getReflectionObject() {
    return method;
  }

  /**
   * {@inheritDoc}
   *
   * <p>Determines whether enclosed {@link Method} satisfies the given predicate.
   *
   * @param reflectionPredicate the {@link ReflectionPredicate} to be checked
   * @return true only if the method in this object satisfies the canUse(Method) of predicate
   */
  @Override
  public boolean satisfies(ReflectionPredicate reflectionPredicate) {
    return reflectionPredicate.test(method);
  }
}
