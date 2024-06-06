package saijavafullstackdevelopement;
import java.util.Scanner;

public class UserLoginCheck {
	   public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		   String username = "SAIKUMAR";
		        String password = "sai123";
		        
		        System.out.print("Enter username: ");
		        String enteredUsername = scanner.nextLine();
		        System.out.print("Enter password: ");
		        String enteredPassword = scanner.nextLine();
		        
		    if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
		    	    System.out.println("Login successful. Welcome, " + username + "!");
		        } 
		    else {
		            System.out.println("Invalid username or password. Please try again.");
		        }

		        scanner.close();
		    }
	   }
		   
	   
		   
	   
	        
	   	         
	        
