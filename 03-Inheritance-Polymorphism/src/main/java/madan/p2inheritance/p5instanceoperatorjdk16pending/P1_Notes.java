package madan.p2inheritance.p5instanceoperatorjdk16pending;

public class P1_Notes {

    /**
     *✅  Java instanceof Keyword
     * The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
     * The instanceof in java is also known as type comparison operator because it compares the instance with type.
     * It returns either true or false. If we apply the instanceof operator with any variable that has null value, it returns false.
     *
     * 🔵 Simple Example of Java instanceof
     *
     * class Simple1{
     *  public static void main(String args[]){
     *  Simple1 s=new Simple1();
     *  System.out.println(s instanceof Simple1);//true
     *  }
     * }
     *
     * Output:true
     *
     * 🔵 An object of subclass type is also a type of parent class.
     * For example, if Dog extends Animal then object of Dog can be referred by either Dog or Animal class.
     *
     * class Animal{}
     * class Dog1 extends Animal{//Dog inherits Animal
     *
     *  public static void main(String args[]){
     *  Dog1 d=new Dog1();
     *  System.out.println(d instanceof Animal);//true
     *  }
     * }
     *
     * Output:true
     *
     *
     * 🔵 instanceof in java with a variable that have null value
     *
     * If we apply instanceof operator with a variable that have null value, it returns false.
     *
     * class Dog2{
     *  public static void main(String args[]){
     *   Dog2 d=null;
     *   System.out.println(d instanceof Dog2);//false
     *  }
     * }
     *
     * Output:false
     *
     * 🔵 Downcasting with java instanceof operator
     * When a subclass reference variable points to an object of the parent class, it's called downcasting.
     * However, this is not allowed directly by the compiler because it's potentially unsafe.
     * 🚫 Direct Downcasting Causes Compilation Error
     * Example:
     * Parent p = new Parent();
     * Child c = p; // ❌ Compilation Error
     *
     * ⚠️ Downcasting with Typecasting Compiles, but Fails at Runtime
     * Parent p = new Parent();
     * Child c = (Child) p; // ✅ Compiles
     *                     // ❌ Throws ClassCastException at runtime
     *                     This fails because the actual object is not of type Child, so Java can't cast it safely.
     *
     * ✅ Safe Downcasting Using instanceof
     * You should always check the object type before downcasting:
     * Parent p = new Child();
     *
     * if (p instanceof Child) {
     *     Child c = (Child) p; // ✅ Safe Downcasting
     *     c.someChildMethod();
     * }
     */
}
