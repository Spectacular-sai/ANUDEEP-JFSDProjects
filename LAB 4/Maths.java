package saijavafullstackdevelopement;
import java.util.Scanner;

public class Maths {
		  public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		       // first value
		        System.out.print("Enter first number: ");
		        int a = scanner.nextInt();
		       // second value
		        System.out.print("Enter second number: ");
		        int b = scanner.nextInt();

		        // Addition
		        int sum = a + b;
		        System.out.println("addition of two numbers is: " + sum);

		        // Subtraction
		        int sub = a - b;
		        System.out.println("subtraction of two numbers is: " + sub);

		        // Multiplication
		        int mul = a * b;
		        System.out.println("multiplication of two numbers is: " + mul);

		        // Division
		        if (b!= 0) {
		            int result = a / b;
		            System.out.println("the result of division is : " + result);
		        } else {
		            System.out.println("Cannot divide   ! please trybwith another numbers  .");
		        }

		        scanner.close();
		    }

}
