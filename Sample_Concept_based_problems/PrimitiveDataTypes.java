package week1;

public class PrimitiveDataTypes {
    public static void main(String[] args) {  
        byte byteVar = 100;
        short shortVar = 30000;
        int intVar = 100000;
        long longVar = 10000000000L;
        float floatVar = 3.14f;
        double doubleVar = 3.1415926535;
        char charVar = 'A';
        boolean booleanVar = true;
        System.out.println("--- Primitive Data Types ---");
        System.out.println("byte    : " + byteVar + " (Size: " + Byte.SIZE + " bits)");
        System.out.println("short   : " + shortVar + " (Size: " + Short.SIZE + " bits)");
        System.out.println("int     : " + intVar + " (Size: " + Integer.SIZE + " bits)");
        System.out.println("long    : " + longVar + " (Size: " + Long.SIZE + " bits)");
        System.out.println("float   : " + floatVar + " (Size: " + Float.SIZE + " bits)");
        System.out.println("double  : " + doubleVar + " (Size: " + Double.SIZE + " bits)");
        System.out.println("char    : '" + charVar + "' (Size: " + Character.SIZE + " bits)");
        System.out.println("boolean : " + booleanVar + " (Size: JVM dependent)");
    }
}