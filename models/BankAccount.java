package models;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private int pin;
    private final double withdrawLimit = 10000;

    public BankAccount(int accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean authenticate(int enteredPin) {
        return this.pin == enteredPin;
    }

    public boolean changePin(int oldPin, int newPin) {
        if (this.pin == oldPin) {
            this.pin = newPin;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }
}
