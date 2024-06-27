package saijavafullstackdevelopement;
import java.util.Scanner;

public class SumofEvenOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Enter the size of the array
		        System.out.print("Enter the size of the array: ");
		        int n = scanner.nextInt();
		        int[] a = new int[n]; // Array to store user inputs
		        int sumOdd = 0; // Initialize sum for odd numbers
		        int sumEven = 0; // Initialize sum for even numbers

		        // Enter elements of the array
		        System.out.println("Enter elements of the array:");
		        for (int i = 0; i < n; i++) {
		            a[i] = scanner.nextInt(); // Read user input for each element

		            // Check if the number is odd or even
		            if (a[i] % 2 != 0) {
		                sumOdd += a[i]; // Add to sumOdd if odd number
		            } else {
		                sumEven += a[i]; // Add to sumEven if even number
		            }
		        }

		        // Output the sum of odd and even numbers
		        System.out.println("Sum of odd numbers: " + sumOdd);
		        System.out.println("Sum of even numbers: " + sumEven);

		        
		    }

}
