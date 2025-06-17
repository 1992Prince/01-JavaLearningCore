package madan.p4interface.notes;

public class P1_InterfaceDef {

    /**
     * 🔹 1. What is an Interface in Java? (Interview-ready definition)
     * "Interface in Java is a blueprint of a class which contains only abstract methods (until Java 7) and static/final variables.
     * It defines what needs to be done but not how. Classes that implement an interface must provide implementation for all its methods.
     * It is used to achieve abstraction, loose coupling, and multiple inheritance in Java."
     *
     * 🔹 Start with the definition
     * "Interface in Java is like a contract or rulebook which defines what needs to be done, but not how.
     * The class that implements it must provide the actual implementation.
     * It's used to bring consistency, loose coupling, and flexibility in code."
     *
     * 🔹 Now start the problem story (Without Interface)
     * "Suppose I'm building a ecommerce website and it have payment system where I need to support different payment modes —
     * like Credit Card, Debit Card, UPI, Wallets, etc.
     *
     * Sabka kaam ek hi hai — payment process karna.
     * After adding items to cart and performing checkout I need to call method paymentProcess to process payment for customer.
     * For now we don't have interface and so developers created payment impl for each payment type like below
     *
     * ------------------------------------------------------------------------
     *
     * class CreditCard {
     *     public void payUsingCreditCard(double amount) { ... }
     * }
     *
     * class DebitCard {
     *     public void doDebitTransaction(double amount) { ... }
     * }
     *
     * class UPI {
     *     public void makeUPIPayment(String vpa, double amount) { ... }
     * }
     *
     * "Ab problem yeh hai ki method naam bhi alag hai, signature bhi alag, toh agar mujhe ek common method banana ho like processPayment(),
     * toh mujhe har class ka type check karna padega and uska method call karna padega."
     *
     * This common method I will call after doing checkout for customer.
     *
     *public void processPayment(Object paymentMethod, amount) {
     *     if (paymentMethod instanceof CreditCard) {
     *         ((CreditCard) paymentMethod).payUsingCreditCard(amount);
     *     } else if (paymentMethod instanceof DebitCard) {
     *         ((DebitCard) paymentMethod).doDebitTransaction(amount);
     *     } else if (paymentMethod instanceof UPI) {
     *         ((UPI) paymentMethod).makeUPIPayment("user@upi", amount);
     *     }
     * }
     *
     * ------------------------------------------------------------------------
     *
     * "Yeh approach scalable nahi hai — agar kal ko naya method aata hai, toh mujhe processPayment() ke andar fir se if-else add karna padega."
     *
     * We can reorganise above solution with interface
     *
     * 🔹 Now bring in Interface as the Solution
     * "To solve this, Java provides Interface. Hum ek common PaymentMethod interface bana dete hain jisme ek pay(double amount) method hota hai."
     *
     * public interface PaymentMethod {
     *     void pay(double amount);
     * }
     *
     * "Ab har payment type is interface ko implement karta hai — apne tareeke se."
     * so all payment type classes must have to implement this interface and provide functionality or implementation.
     * Now developers will not create methods on their own, instead they need to give imp in method given by interface PaymentMethod
     * And so all payment type classes will follow same protocols
     *
     * -----------------------------------------------------------------------------
     *
     * class CreditCard implements PaymentMethod {
     *     public void pay(double amount) {
     *         System.out.println("Paid ₹" + amount + " using Credit Card");
     *     }
     * }
     *
     * class UPI implements PaymentMethod {
     *     public void pay(double amount) {
     *         System.out.println("Paid ₹" + amount + " using UPI");
     *     }
     * }
     *
     * class DebitCard implements PaymentMethod {
     *     public void pay(double amount) {
     *         System.out.println("Paid ₹" + amount + " using Debit Card");
     *     }
     * }
     *
     * "Ab mera processPayment() method bahut simple ho gaya:" Jo mai after doing checkout will call
     *
     * public void processPayment(PaymentMethod method, double amount) {
     *     method.pay(amount);
     * }
     *
     * "Ab mujhe nahi pata ki yeh Credit Card hai ya UPI — mujhe sirf interface se deal karna hai,
     * implementation ka tension interface handle kar leta ha
     * ------------------------------------------------------------------------------
     *
     * 🔹 Wrap-up line (Interview-worthy):
     * "So basically, Interface helps bring all different payment methods under a common umbrella.
     * It ensures that all classes follow the same structure (pay() method), while still allowing them to implement the logic differently.
     * This makes the code flexible, clean, and easily extendable when new payment types are added."
     *
     * 🔹 2. Problem Statement: What if Interface didn’t exist? (Real-time example: Database Connectivity)
     * Scenario:
     * Soch Java mein multiple databases se connect karna hai:
     * MySQL
     * Oracle
     * PostgreSQL
     * MongoDB
     *
     * Agar interface ka concept nahi hota, toh har developer alag-alag way mein DB se connect karte:
     */
}
