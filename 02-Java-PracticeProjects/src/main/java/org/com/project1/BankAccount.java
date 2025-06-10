package org.com.project1;

public class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder){
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void deposit(double amount){
        if(amount <= 0){
            throw new RuntimeException("Pls enter valid amount");
        }
        this.balance += amount;
        System.out.println(this.accountHolder + "is deposited with balance - " + amount);
    }

    public void withdraw(double amount){
        if(amount > this.balance){
            throw new RuntimeException("entered amount should be less than balance : " + this.balance);
        }
        this.balance -= amount;
        System.out.println(accountHolder + " withdrew ₹" + amount);
    }

    public double getBalance(){
        return this.balance;
    }

    public String getAccountHolder(){
        return this.accountHolder;
    }
}
