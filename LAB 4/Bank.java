package saijavafullstackdevelopement;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
	 
	 Scanner scanner = new Scanner(System.in);
     // Predetermined bank account number
     int bankAccount = 123456789;
     int balance = 100;

     System.out.println("Enter your bank account number:");
     int userInputAccount = scanner.nextInt();

     if (userInputAccount == bankAccount) {
         System.out.println("Welcome to banking!");
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. Check Balance");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter the amount to deposit: ");
                 int depositAmount = scanner.nextInt();
                 if (depositAmount > 0) {
                     balance += depositAmount;
                     System.out.println("Deposit successful!");
                 } else {
                     System.out.println("Invalid amount! Please enter a positive number.");
                 }
                 break;
             case 2:
                 System.out.print("Enter the amount to withdraw: ");
                 int withdrawAmount = scanner.nextInt();
                 if (withdrawAmount > 0 && withdrawAmount <= balance) {
                     balance -= withdrawAmount;
                     System.out.println("Withdrawal successful!");
                 } else if (withdrawAmount > balance) {
                     System.out.println("Insufficient funds!");
                 } else {
                     System.out.println("Invalid amount! Please enter a positive number.");
                 }
                 break;
             case 3:
                 System.out.println("Your current balance is: " + balance);
                 break;
             default:
                 System.out.println("Invalid choice! Please enter a number between 1 and 3.");
         }
     } else {
         System.out.println("Invalid account number! Please enter the correct bank account number.");
     }

 }
	
	
}
	
