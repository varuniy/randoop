package randoop.test;

import java.text.Normalizer;
import org.checkerframework.checker.nullness.qual.PolyNull;
import org.plumelib.util.StringsPlume;
import randoop.Globals;

/**
 * An {@code ExceptionCheck} that enforces the expectation of an exception being thrown. In
 * particular,
 *
 * <ul>
 *   <li>fails if exception is not thrown, and
 *   <li>succeeds only when expected exception is thrown.
 * </ul>
 */
public class ExpectedExceptionCheck extends ExceptionCheck {

  /** A boolean indicating the accessibility of the method. */
  private boolean isAccessible;

  /**
   * Creates check that enforces expectation that an exception is thrown by the statement at the
   * statement index.
   *
   * <p>These are created before the test is classified as normal, exceptional, or invalid behavior.
   * For example, this could be created with a TimeoutException, but the sequence would later be
   * classified as invalid.
   *
   * @param exception the expected exception
   * @param statementIndex the index of the statement in the sequence where exception is thrown
   * @param catchClassName the name of exception to be caught
   */
  public ExpectedExceptionCheck(
      Throwable exception, int statementIndex, String catchClassName, boolean isAccessible) {
    super(exception, statementIndex, catchClassName);
    this.isAccessible = isAccessible;
  }

  /**
   * {@inheritDoc}
   *
   * <p>Appends a fail assertion after statement in try block.
   */
  @Override
  protected void appendTryBehavior(StringBuilder b) {
    String message;
    String assertion;
    if (exception.getClass().isAnonymousClass()) {
      message = "Expected anonymous exception";
    } else {
      String exceptionMessage;
      try {
        exceptionMessage = "; message: " + toAscii(exception.getMessage());
      } catch (Throwable t) {
        exceptionMessage = " whose getMessage() throws an exception";
      }
      message = "Expected exception of type " + getExceptionName() + exceptionMessage;
    }
    if (isAccessible) {
      assertion = "org.junit.Assert.fail(\"" + StringsPlume.escapeJava(message) + "\")";
    } else {
      assertion =
          "org.junit.Assert.fail(\""
              + "Expected exception of type java.lang.reflect.InvocationTargetException"
              + "\")";
    }
    b.append(Globals.lineSep).append("  ").append(assertion).append(";").append(Globals.lineSep);
  }

  /**
   * Converts the given string to ASCII. Replaces non-ASCII characters by an ASCII equivalent or by
   * "?".
   *
   * @param str the string to convert to ASCII
   * @return the string converted to ASCII
   */
  private @PolyNull String toAscii(@PolyNull String str) {
    if (str == null) return null;
    String normalized = Normalizer.normalize(str, Normalizer.Form.NFD);
    String ascii = normalized.replaceAll("[^ -~]", "?");
    return ascii;
  }

  /**
   * {@inheritDoc}
   *
   * <p>Appends assertion to confirm expected exception caught.
   */
  @Override
  protected void appendCatchBehavior(StringBuilder b, String catchClassName) {
    if (!isAccessible) {
      b.append("catch (")
          .append("java.lang.reflect.InvocationTargetException")
          .append(" e) {")
          .append(Globals.lineSep);
      String message = "Expected exception of type " + catchClassName;
      String assertion = "org.junit.Assert.fail(\"" + message + "\")";
      b.append("  Throwable cause = e.getCause();").append(Globals.lineSep);
      b.append("  if (cause instanceof ")
          .append(catchClassName)
          .append(") {")
          .append(Globals.lineSep);
      b.append("    // This is an expected exception.").append(Globals.lineSep);
      b.append("  } else {").append(Globals.lineSep);
      b.append("    ").append(assertion).append(";").append(Globals.lineSep);
      b.append("  }").append(Globals.lineSep);
    } else if (exception.getClass().isAnonymousClass()) {
      b.append("catch (").append(catchClassName).append(" e) {").append(Globals.lineSep);
      b.append("  // This is an expected exception.").append(Globals.lineSep);
      String condition = "e.getClass().isAnonymousClass()";
      String message = "Expected anonymous exception, got \" + e.getClass().getCanonicalName()";
      String assertion = "org.junit.Assert.fail(\"" + message + ")";
      b.append("  if (! ").append(condition).append(") {").append(Globals.lineSep);
      b.append("    ").append(assertion).append(";").append(Globals.lineSep);
      b.append("  }").append(Globals.lineSep);
    } else {
      b.append("catch (").append(catchClassName).append(" e) {").append(Globals.lineSep);
      b.append("  // This is an expected exception.").append(Globals.lineSep);
    }
  }
}
