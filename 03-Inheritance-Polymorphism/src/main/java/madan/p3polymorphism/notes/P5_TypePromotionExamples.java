package madan.p3polymorphism.notes;

public class P5_TypePromotionExamples {


    // float parameter method
    void test(float val) {
        System.out.println("float method");
    }

    // double parameter method
    void test(double val) {
        System.out.println("double method");
    }

    // byte parameter method
    void test(byte val) {
        System.out.println("byte method");
    }

    // short parameter method
    void test(short val) {
        System.out.println("short method");
    }

    // int parameter method
    void test(int val) {
        System.out.println("int method");
    }

    public static void main(String[] args) {
        P5_TypePromotionExamples obj = new P5_TypePromotionExamples();

        int a = 10;
        obj.test(a); // Exact match: int method

        obj.test(10); // int literal: int method

        obj.test(10.0); // double literal: double method

        obj.test(10.0f); // float literal: float method

        char ch = 'A';
        obj.test(ch); // char -> int: int method

        byte b = 5;
        obj.test(b); // byte: byte method

        short s = 15;
        obj.test(s); // short: short method

        // If we remove test(int), test(byte), test(short), what happens?
        // Uncomment below block to test ambiguity & promotion cases
        /*
        obj.test(10); // Will call float method due to promotion int -> float (if int method not defined)
        obj.test('B'); // char -> int -> float or double (depends on availability)
        */

        // Explicit casting
        obj.test((byte) 10); // Will match byte method
        obj.test((short) 10); // Will match short method
    }
}
