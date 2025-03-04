class BankAccount {
    private double balance;  // Encapsulated data

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            balance = initialBalance;
        } else {
            balance = 0;
            System.out.println("Invalid initial balance. Setting to 0.");
        }
    }

    // Public getter method (controlled access)
    public double getBalance() {
        return balance;
    }

    // Public setter method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

public class Encapsulation_Example {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);  // Initial balance
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1500);  // Should fail

        // account.balance = -500; // ❌ Error: Cannot access private field
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
