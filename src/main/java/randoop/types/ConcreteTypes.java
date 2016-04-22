package randoop.types;

/**
 * Created by bjkeller on 4/8/16.
 */
public class ConcreteTypes {
  public static final PrimitiveType BOOLEAN_TYPE = new PrimitiveType(boolean.class);
  public static final PrimitiveType BYTE_TYPE = new PrimitiveType(byte.class);
  public static final PrimitiveType CHAR_TYPE = new PrimitiveType(char.class);
  public static final ClassOrInterfaceType CLASS_TYPE = new SimpleClassOrInterfaceType(Class.class);
  public static final PrimitiveType DOUBLE_TYPE = new PrimitiveType(double.class);
  public static final PrimitiveType FLOAT_TYPE = new PrimitiveType(float.class);
  public static final PrimitiveType INT_TYPE = new PrimitiveType(int.class);
  public static final PrimitiveType LONG_TYPE = new PrimitiveType(long.class);
  public static final ClassOrInterfaceType OBJECT_TYPE = new SimpleClassOrInterfaceType(Object.class);
  public static final PrimitiveType SHORT_TYPE = new PrimitiveType(short.class);
  public static final ClassOrInterfaceType STRING_TYPE = new SimpleClassOrInterfaceType(String.class);
  public static final PrimitiveType VOID_TYPE = new PrimitiveType(void.class);

}
