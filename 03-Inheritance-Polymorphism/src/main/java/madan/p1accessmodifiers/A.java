package madan.p1accessmodifiers;

// ✅ Here, private x and show() are accessed only inside class A → Legal
public class A {
    private int x = 10;

    private void show() {
        System.out.println("Inside show(): x = " + x);
    }

    public void test() {
        // ✅ Private members accessible within same class
        show();
        System.out.println("Inside test(): x = " + x);
    }
}
