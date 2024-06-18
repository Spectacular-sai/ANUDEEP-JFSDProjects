package saijavafullstackdevelopement;
import java.util.Scanner;

 class Account {
	private String accountType;
    private double balance;

 
    public Account(String accountType) {
        this.accountType = accountType;
        this.balance = 10000.00;
    }

   
    public void deposit(double amount) {
        balance += amount; 
        System.out.println("Deposit of " + amount + " accepted. New balance: " + balance);
    }

   
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount; 
            System.out.println("Withdrawal of " + amount + " accepted. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal of $" + amount + " not processed.");
        }
    }

    
    public double checkBalance() {
        return balance;
    }

   
    public String getAccountType() {
        return accountType;
    }
}

public class BankAccount {
	public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account type (e.g., savings, checking): ");
        String accountType = scanner.nextLine();

        Account account = new Account(accountType);

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                break;
            case 2:
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = scanner.nextDouble();
                account.withdraw(withdrawalAmount);
                break;
            case 3:
                System.out.println("Current balance: " + account.checkBalance());
                System.out.println("Account type: " + account.getAccountType());
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }

       
    }
}
	 