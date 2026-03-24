package services;

import interfaces.ATMService;
import models.BankAccount;

public class ATMServiceImpl implements ATMService {

    private BankAccount account;

    public ATMServiceImpl(BankAccount account) {
        this.account = account;
    }

    @Override
    public void checkBalance() {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: ₹" + account.getBalance());
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
        } else {
            account.setBalance(account.getBalance() + amount);
            System.out.println("₹" + amount + " deposited successfully.");
            System.out.println("Updated Balance: ₹" + account.getBalance());
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > account.getWithdrawLimit()) {
            System.out.println("Withdrawal limit exceeded! Max limit is ₹" + account.getWithdrawLimit());
        } else if (amount > account.getBalance()) {
            System.out.println("Insufficient balance!");
        } else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Please collect your cash: ₹" + amount);
            System.out.println("Remaining Balance: ₹" + account.getBalance());
        }
    }

    @Override
    public void changePin(int oldPin, int newPin) {
        if (newPin < 1000 || newPin > 9999) {
            System.out.println("New PIN must be 4 digits!");
            return;
        }

        if (account.changePin(oldPin, newPin)) {
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("Old PIN is incorrect!");
        }
    }
}
