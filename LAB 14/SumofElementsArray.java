package saijavafullstackdevelopement;
import java.util.Scanner;

public class SumofElementsArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] a = new int[n]; // array to store user inputs
        int sum = 0; // Initialize sum for array elements

        // Prompt user to enter elements of the array
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt(); // Read user input for each element
            sum += a[i]; // Add each element to the sum
        }

        // Output the sum of array elements
        System.out.println("Sum of array elements: " + sum);

    }

}
