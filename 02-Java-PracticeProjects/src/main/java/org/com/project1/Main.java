package org.com.project1;

public class Main {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Ravi");
        BankAccount acc2 = new BankAccount("Meena");

        acc1.deposit(1000);
        acc1.withdraw(300);
        System.out.println("Balance of " + acc1.getAccountHolder() + ": ₹" + acc1.getBalance());

        System.out.println();

        acc2.deposit(5000);
        acc2.withdraw(700);
        System.out.println("Balance of " + acc2.getAccountHolder() + ": ₹" + acc2.getBalance());
    }
}
