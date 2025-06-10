package madan.p1accessmodifiers;

public class Main {

    public static void main(String[] args) {
        A obj = new A();
        obj.test(); // ✅ Allowed — calling public method which internally uses private members

        /**
         * Inside show(): x = 10
         * Inside test(): x = 10
         */
    }
}
