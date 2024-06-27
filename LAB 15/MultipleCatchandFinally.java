package saijavafullstackdevelopement;

public class MultipleCatchandFinally {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        try {
		            int[] numbers = {1, 2, 3};
		            int index = 4;
		            
		            // Attempting to access an index out of bounds
		            int value = numbers[index];
		            
		            // Attempting to divide by zero
		            int result = 10 / 0;
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.err.println("Caught ArrayIndexOutOfBoundsException: Index is out of bounds.");
		        } catch (ArithmeticException e) {
		            System.err.println("Caught ArithmeticException: Cannot divide by zero.");
		        } catch (Exception e) {
		            System.err.println("Caught Exception: " + e.getMessage());
		        } finally {
		            System.out.println("Inside finally block. This block always executes.");
		        }

		        System.out.println("End of program");
		    }

}
