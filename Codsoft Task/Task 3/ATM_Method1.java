import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

public class ATM_Method1 {
    private BankAccount userAccount;

    public ATM_Method1() {
        userAccount = null;
    }

    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: $");
        double initialBalance = scanner.nextDouble();
        userAccount = new BankAccount(initialBalance);
    }

    public void showOptions() {
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void run() {
        if (userAccount == null) {
            System.out.println("Please create an account first.");
            return;
        }
    
        Scanner scanner = new Scanner(System.in);
    
        while (true) {
            System.out.println("\nATM Menu:");
            showOptions();
            System.out.print("Select an option (1/2/3/4): ");
            String choice = scanner.nextLine();
    
            switch (choice) {
                case "1":
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    if (userAccount.deposit(depositAmount)) {
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
    
                case "2":
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    if (userAccount.withdraw(withdrawalAmount)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient balance.");
                    }
                    break;
    
                case "3":
                    System.out.println("Current balance: $" + userAccount.getBalance());
                    break;
    
                case "4":
                    System.out.println("Exiting ATM_Method1. Thank you!");
                    return;
    
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
    

    public static void main(String[] args) {
        ATM_Method1 atm = new ATM_Method1();
        atm.createAccount();
        atm.run();
    }
}

