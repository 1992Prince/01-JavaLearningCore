package org.functionalinterfaces;

public class LoanInfo {

    private int noOfMonths;
    private double loanAmount;
    private double interestRate;

    public LoanInfo(int noOfMonths, double loanAmount, double interestRate) {
        this.noOfMonths = noOfMonths;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    public int getNoOfMonths() {
        return noOfMonths;
    }

    public void setNoOfMonths(int noOfMonths) {
        this.noOfMonths = noOfMonths;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
