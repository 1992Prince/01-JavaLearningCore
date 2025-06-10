package org.tim.sec7basicoops1;

// QUESTION 2: PURPOSE OF ENCAPSULATION AND HOW TO ENSURE IT
public class EncapsulationExample {
    // PRIVATE fields - core principle of encapsulation
    private String bankAccountNumber;
    private double balance;
    private String pin;

    public EncapsulationExample(String accountNumber, String pin) {
        this.bankAccountNumber = accountNumber;
        this.pin = pin;
        this.balance = 0.0;
    }

    // PUBLIC methods for controlled access
    public double getBalance(String enteredPin) {
        if (validatePin(enteredPin)) {
            return balance;
        } else {
            throw new SecurityException("Invalid PIN");
        }
    }

    public void deposit(double amount, String enteredPin) {
        if (!validatePin(enteredPin)) {
            throw new SecurityException("Invalid PIN");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        balance += amount;
    }

    // PRIVATE helper method - internal implementation hidden
    private boolean validatePin(String enteredPin) {
        return this.pin.equals(enteredPin);
    }

    // NO direct setter for balance - only through controlled methods
    // NO getter for PIN - sensitive data completely hidden
}
