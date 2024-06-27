package saijavafullstackdevelopement;
import java.util.Scanner;

public class SumOfOddPositive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        //  enter the size of the array
		        System.out.print("Enter the size of the array: ");
		        int n = scanner.nextInt();
		        int[] a = new int[n]; // array to store user inputs
		        int sum = 0; // Initialize sum for positive odd numbers

		        //  enter elements of the array
		        System.out.println("Enter elements of the array:");
		        for (int i = 0; i < n; i++) {
		            a[i] = scanner.nextInt(); // Read user input for each element

		            // Check if the number is positive and odd
		            if (a[i] > 0 && a[i] % 2 != 0) {
		                sum += a[i]; // Add to sum if positive odd number
		            }
		        }

		        // Output the sum of positive odd numbers
		        System.out.println("Sum of positive odd numbers: " + sum);

		        
		    }
	

}
