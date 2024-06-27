package saijavafullstackdevelopement;
import java.util.Scanner;

public class LargerSmallerArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        
		        // Prompt user to enter the size of the array
		        System.out.print("Enter the size of the array: ");
		        int size = sc.nextInt();
		        
		        // Validate that the size is positive
		        while (size <= 0) {
		            System.out.println("Invalid size. Please enter a valid size:");
		            size = sc.nextInt();
		        }
		        
		        // Create an array of the specified size
		        int[] a = new int[size];
		        
		        // Prompt user to enter values for the array
		        System.out.println("Enter the values of the array:");
		        for (int i = 0; i < size; i++) {
		            System.out.print("Enter value at index " + i + ": ");
		            a[i] = sc.nextInt();
		        }
		        
		        // Initialize variables to track largest and smallest values
		        int larger = a[0];
		        int smaller = a[0];
		        
		        // Find the largest and smallest values in the array
		        for (int i = 1; i < size; i++) {
		            if (a[i] > larger) {
		                larger = a[i];
		            }
		            if (a[i] < smaller) {
		                smaller = a[i];
		            }
		        }
		        
		        // Print the largest and smallest values found
		        System.out.println("The largest number in the array is: " + larger);
		        System.out.println("The smallest number in the array is: " + smaller);
		      
		    }

}
