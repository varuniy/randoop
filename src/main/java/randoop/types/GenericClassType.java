package randoop.types;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import plume.UtilMDE;

/**
 * Represents the type of a generic class.
 * Related to concrete {@link InstantiatedType} by instantiating with a
 * {@link Substitution}.
 */
public class GenericClassType extends ParameterizedType {

  /** The rawtype of the generic class. */
  private Class<?> rawType;

  /** the type parameters of the generic class */
  private List<TypeVariable> parameters;

  /**
   * Create a {@code GenericClassType} for the given rawtype with the parameters,
   * and parameter type bounds.
   * <p>
   * This constructor is intended to mainly be used by
   * {@link randoop.types.GeneralType#forType(Type)} where the full set of arguments is
   * collected before creating the type object.
   *
   * @param rawType  the rawtype for the generic class
   * @param parameters  the type parameters for the generic class
   */
  GenericClassType(Class<?> rawType, List<TypeVariable> parameters) {
    if (rawType.getTypeParameters().length != parameters.size()) {
      throw new IllegalArgumentException("number of parameters should be equal");
    }

    this.rawType = rawType;
    this.parameters = parameters;
  }

  /**
   * {@inheritDoc}
   * Checks that the rawtypes are the same. This is sufficient since the
   * type parameters and their bounds can be reconstructed from the Class object.
   *
   * @return true if two generic classes have the same rawtype, false otherwise
   */
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof GenericClassType)) {
      return false;
    }
    GenericClassType t = (GenericClassType) obj;
    return this.rawType.equals(t.rawType)
            && this.parameters.equals(t.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawType, parameters);
  }

  /**
   * {@inheritDoc}
   * @return the name of this type
   */
  @Override
  public String toString() {
    return this.getName();
  }

  /**
   * {@inheritDoc}
   * @return the fully qualified name of this type with type parameters
   */
  @Override
  public String getName() {
    return rawType.getCanonicalName() + "<" + UtilMDE.join(parameters, ",") + ">";
  }

  /**
   * {@inheritDoc}
   * @return list of {@link ReferenceArgument} for each parameter
   */
  @Override
  public List<TypeArgument> getTypeArguments() {
    List<TypeArgument> argumentList = new ArrayList<>();
    for (TypeVariable v : parameters) {
      argumentList.add(new ReferenceArgument(v));
    }
    return argumentList;
  }

  @Override
  public boolean isInstantiationOf(GenericClassType genericClassType) {
    return this.equals(genericClassType);
  }

  @Override
  public boolean isInterface() {
    return rawType.isInterface();
  }

  @Override
  public boolean isGeneric() {
    return true;
  }

  /**
   * Instantiates this generic class using the substitution to replace the type
   * parameters.
   *
   * @param substitution  the type substitution
   * @return a {@link ParameterizedType} instantiating this generic class by the
   * given substitution
   */
  @Override
  public InstantiatedType apply(Substitution<ReferenceType> substitution) {
    if (substitution == null) {
      throw new IllegalArgumentException("substitution must be non-null");
    }

    List<TypeArgument> argumentList = new ArrayList<>();
    for (TypeVariable variable : parameters) {
      ReferenceType referenceType = substitution.get(variable);
      if (referenceType == null) {
        throw new IllegalArgumentException("substitution has no value for variable " + variable.getName());
      }
      argumentList.add(new ReferenceArgument(referenceType));
    }
    return new InstantiatedType(this, argumentList);
  }

  /**
   * Creates a type substitution using the given type arguments and applies it to this type.
   * @see #apply(Substitution)
   *
   * @param typeArguments  the type arguments
   * @return a type which is this type parameterized by the given type arguments
   */
  public ParameterizedType instantiate(ReferenceType... typeArguments) {
    if (typeArguments.length != this.getTypeParameters().size()) {
      throw new IllegalArgumentException("number of arguments and parameters must match");
    }

    Substitution<ReferenceType> substitution = Substitution.forArgs(this.parameters, typeArguments);
    return this.apply(substitution);
  }

  /**
   * {@inheritDoc}
   * @return the rawtype of this generic class
   */
  @Override
  public Class<?> getRuntimeClass() {
    return rawType;
  }

  /**
   * Returns the list of type parameters of this generic class
   *
   * @return the list of type parameters of this generic class
   */
  public List<TypeVariable> getTypeParameters() {
    return parameters;
  }

  /**
   * Returns a direct supertype of this type that either matches the given type,
   * or has a rawtype assignable to (and so could be subtype of) the given type.
   * Returns null if no such supertype is found.
   * Construction guarantees that substitution on this generic class type will
   * work on returned generic supertype as required by
   * {@link ParameterizedType#isSubtypeOf(GeneralType)}.
   *
   * @param type  the potential supertype
   * @return a supertype of this type that matches the given type or
   * has an assignable rawtype; or null otherwise
   * @throws IllegalArgumentException if type is null
   */
  GenericClassType getMatchingSupertype(GenericClassType type) {
    if (type == null) {
      throw new IllegalArgumentException("type may not be null");
    }

    // minimally, underlying Class should be assignable
    Class<?> otherRawType = type.getRuntimeClass();
    if (!otherRawType.isAssignableFrom(this.rawType)) {
      return null;
    }

    // if other type is an interface, check interfaces first
    if (otherRawType.isInterface()) {
      Type[] interfaces = this.rawType.getGenericInterfaces();
      for (Type t : interfaces) {
        GeneralType generalType = GeneralType.forType(t);
        if (generalType.isGeneric() && type.equals(generalType)) { // found the type
          return (GenericClassType) generalType;
        }
      }
    }

    // otherwise, check superclass
    Type superclass = this.rawType.getGenericSuperclass();
    if (superclass != null) {
      GeneralType superType = GeneralType.forType(superclass);
      if (type.equals(superType)) { // found the type
        return (GenericClassType) superType;
      }
      if (superType.isObject()) {
        return null;
      }
      if (otherRawType.isAssignableFrom(superType.getRuntimeClass())) {
        return (GenericClassType) superType;
      }
    }

    return null;
  }

  /**
   * {@inheritDoc}
   * Handles the specific cases of supertypes of a generic class
   * <code>C&lt;F<sub>1</sub>,...,F<sub>n</sub>&gt;</code>
   * for which the direct supertypes are:
   * <ol>
   *   <li>the direct superclass,</li>
   *   <li>the direct superinterfaces,</li>
   *   <li>the type <code>Object</code>, and</li>
   *   <li>the raw type <code>C</code></li>
   * </ol>
   */
  @Override
  public boolean isSubtypeOf(GeneralType otherType) {
    if (otherType == null) {
      throw new IllegalArgumentException("type must be non-null");
    }

    if (super.isSubtypeOf(otherType)) {
      return true;
    }

    return otherType.isRawtype()
            && otherType.hasRuntimeClass(this.getRuntimeClass());
  }

  @Override
  public ClassOrInterfaceType getSuperclass() {
    Type superclass = this.rawType.getGenericSuperclass();
    if (superclass == null) {
      return null;
    }

    return ClassOrInterfaceType.forType(superclass);
  }

  @Override
  public List<ClassOrInterfaceType> getInterfaces() {
    List<ClassOrInterfaceType> interfaces = new ArrayList<>();
    for (Type type : rawType.getGenericInterfaces()) {
      interfaces.add(ClassOrInterfaceType.forType(type));
    }
    return interfaces;
  }
}
