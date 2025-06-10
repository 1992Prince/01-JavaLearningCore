package org.tim.sec7basicoops1;
// ============================================
// ENCAPSULATION EXAMPLE - BANK ACCOUNT
// ============================================
public class P2_BankAccount {

    private String accountNumber;
    private double balance;
    private String ownerName;

    public P2_BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;  // Default balance
    }

    // Getter for balance (READ-ONLY access)
    public double getBalance() {
        return balance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for owner name
    public String getOwnerName() {
        return ownerName;
    }

    // NO DIRECT SETTER for balance - only through deposit/withdraw
    // This is ENCAPSULATION - hiding internal state and providing controlled access

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount");
            return false;
        }
    }
}
