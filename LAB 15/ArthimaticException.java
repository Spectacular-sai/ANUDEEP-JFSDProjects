package saijavafullstackdevelopement;

public class ArthimaticException {
	public static void main(String[] args) {
	       try {
	            int a = 10, b = 0;
	         // Division by zero will throw ArithmeticException
	            int result = a / b;  
	         // This line will not be reached
	            System.out.println("Result of division: " + result); 
	        } catch (ArithmeticException e) {
	            System.err.println("Cannot divide by zero!");
	        }

	        try {
	            int[] array = {1, 2, 3, 4, 5,6};
	            int index = 10;  // Accessing index 10 in an array of size 5 will throw ArrayIndexOutOfBoundsException
	            int element = array[index];
	            System.out.println("Element at index " + index + ": " + element);  // This line will not be reached
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.err.println("Array index out of bounds!");
	        }

	        System.out.println("End of program");
	    }
}
