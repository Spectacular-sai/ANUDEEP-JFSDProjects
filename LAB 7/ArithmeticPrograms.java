package saijavafullstackdevelopement;
import java.util.Scanner;

public class ArithmeticPrograms {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int a, b;
        char operator;

        System.out.print("Enter first number: ");
        a = scanner.nextInt();

        System.out.print("Enter second number: ");
        b = scanner.nextInt();

        System.out.print("Choose operation (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
              System.out.println("result="+(a+b));
                break;
            case '-':
            	System.out.println("result="+(a-b));
                break;
            case '*':
            	System.out.println("result="+(a*b));
                break;
            case '/':
                if (b != 0) {
                	System.out.println("result="+(a/b));
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose +, -, *, or /.");
                return;
        }

       
        
    }
	}
	
