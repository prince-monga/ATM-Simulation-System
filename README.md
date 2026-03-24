# ATM Simulation System

A beginner-friendly and real-world style **ATM Simulation System** built using **Core Java** and **Object-Oriented Programming (OOP)** principles.  
This project simulates basic ATM operations such as secure login using **Account Number + PIN**, balance inquiry, deposit, withdrawal, and PIN change.

---

## 🚀 Features

- Multiple account support
- Login using **Account Number + PIN**
- Check account balance
- Deposit money
- Withdraw money
- Change PIN
- Withdrawal limit validation
- Input validation using **try-catch**
- Beginner-friendly modular code structure

---

## 🛠️ Technologies Used

- **Core Java**
- **OOP Concepts**
- **Java Packages**
- **Exception Handling**
- **Console-Based Application**

---

## 📂 Project Structure

ATM-Simulation-System/
│
├── interfaces/
│ └── ATMService.java
│
├── models/
│ ├── BankAccount.java
│ └── SavingAccount.java
│
├── services/
│ └── ATMServiceImpl.java
│
└── ATMApp.java

---

## 💡 OOP Concepts Used

### 1. Abstraction
Used through the `ATMService` interface.

### 2. Encapsulation
Used in the `BankAccount` class with private fields like:
- accountNumber
- balance
- pin

### 3. Inheritance
`SavingAccount` extends `BankAccount`.

### 4. Polymorphism
`ATMService` reference is used with `ATMServiceImpl` object.

Example:
```java
ATMService atm = new ATMServiceImpl(selectedAccount);
