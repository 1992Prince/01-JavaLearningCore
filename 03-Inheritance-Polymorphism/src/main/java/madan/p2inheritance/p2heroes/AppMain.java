package madan.p2inheritance.p2heroes;

public class AppMain {

    public static void main(String[] args) {

        /**
         * Below we are creating obj of class IronMan
         * We can access IronMan class and its parent class methods but
         * We can't access IronMan class and its parent class protected members
         */
        IronMan ironMan = new IronMan();
        ironMan.walk();
        ironMan.eat("electric");
        ironMan.sleep();
        ironMan.usePower();

        /**
         * Person is walking
         * Person is eating food - electric
         * Person is sleeping
         * IronMan is using his power
         */
    }
}
