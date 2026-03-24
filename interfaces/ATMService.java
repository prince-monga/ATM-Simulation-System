package interfaces;

public interface ATMService {
    void checkBalance();
    void deposit(double amount);
    void withdraw(double amount);
    void changePin(int oldPin, int newPin);
}
