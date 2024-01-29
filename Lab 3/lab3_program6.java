public class lab3_program6{

    void promotion(byte value) {
        short nextValue = value;
        System.out.println("byte " + value + " is promoted to short: " + nextValue);
    }

    void promotion(short value) {
        int nextValue = value;
        System.out.println("short " + value + " is promoted to int: " + nextValue);
    }

    void promotion(char value) {
        int nextValue = value;
        System.out.println("char '" + value + "' is promoted to int: " + nextValue);
    }

    void promotion(int value) {
        long nextValue = value;
        System.out.println("int " + value + " is promoted to long: " + nextValue);
    }

    void promotion(long value) {
        double nextValue = value;
        System.out.println("long " + value + " is promoted to double: " + nextValue);
    }

    void promotion(double value) {
        Object nextValue = value;
        System.out.println("double " + value + " is promoted to Object: " + nextValue.getClass().getSimpleName());
    }

    void promotion(Object value) {
        System.out.println(value.getClass().getSimpleName() + " is an Object, and no further promotion is possible.");
    }

    public static void main(String[] args) {
        lab3_program6 tp = new lab3_program6();

        byte byteValue = 1;
        short shortValue = 2;
        char charValue = 'A';
        int intValue = 3;
        long longValue = 4L;
        double doubleValue = 5.0;
        String stringValue = "Hello";

        tp.promotion(byteValue);
        tp.promotion(shortValue);
        tp.promotion(charValue);
        tp.promotion(intValue);
        tp.promotion(longValue);
        tp.promotion(doubleValue);
        tp.promotion(stringValue);
    }
}