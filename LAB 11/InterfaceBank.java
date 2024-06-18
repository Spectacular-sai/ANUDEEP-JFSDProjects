package saijavafullstackdevelopement;
import java.util.Scanner;
interface BankingInterface {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
class SavingsAccount implements BankingInterface {
    private double balance;

    public SavingsAccount() {
        this.balance = 5000; 
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    public double getBalance() {
        return balance;
    }
}
class CurrentAccount implements BankingInterface {
    private double balance;
    public CurrentAccount() {
        this.balance = 5000; 
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    public double getBalance() {
        return balance;
    }
}

public class InterfaceBank {
	public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select account type: 1.(Savings Account) 2.(Current Account)");
        int accountType = scanner.nextInt();
        BankingInterface account;
        switch (accountType) {
            case 1:
                account = new SavingsAccount();
                break;
            case 2:
                account = new CurrentAccount();
                break;
            default:
                System.out.println("Invalid account type selected. Exiting program.");
                scanner.close();
                return;
        }
        System.out.println("Enter operation: 1.(Deposit) 2.(Withdraw)");
        int operation = scanner.nextInt();
        double amount;
        switch (operation) {
            case 1:
                System.out.println("Enter deposit amount:");
                amount = scanner.nextDouble();
                account.deposit(amount);
                break;
            case 2:
                System.out.println("Enter withdraw amount:");
                amount = scanner.nextDouble();
                account.withdraw(amount);
                break;
            default:
                System.out.println("Invalid operation selected. Exiting program.");
               
                return;
        }
        System.out.println("Account Balance: " + account.getBalance());
    }
}

