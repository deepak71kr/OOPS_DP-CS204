public class Q6{

    static void displayNextType(byte value) {
        short nextValue = value;
        System.out.println("byte " + value + " is promoted to short: " + nextValue);
    }

    static void displayNextType(short value) {
        int nextValue = value;
        System.out.println("short " + value + " is promoted to int: " + nextValue);
    }

    static void displayNextType(char value) {
        int nextValue = value;
        System.out.println("char '" + value + "' is promoted to int: " + nextValue);
    }

    static void displayNextType(int value) {
        long nextValue = value;
        System.out.println("int " + value + " is promoted to long: " + nextValue);
    }

    static void displayNextType(long value) {
        double nextValue = value;
        System.out.println("long " + value + " is promoted to double: " + nextValue);
    }

    static void displayNextType(double value) {
        Object nextValue = value;
        System.out.println("double " + value + " is promoted to Object: " + nextValue.getClass().getSimpleName());
    }

    static void displayNextType(Object value) {
        System.out.println(value.getClass().getSimpleName() + " is an Object, and no further promotion is possible.");
    }

    public static void main(String[] args) {
        byte byteValue = 1;
        short shortValue = 2;
        char charValue = 'A';
        int intValue = 3;
        long longValue = 4L;
        double doubleValue = 5.0;
        String stringValue = "Hello";

        displayNextType(byteValue);
        displayNextType(shortValue);
        displayNextType(charValue);
        displayNextType(intValue);
        displayNextType(longValue);
        displayNextType(doubleValue);
        displayNextType(stringValue); 
    }
}
