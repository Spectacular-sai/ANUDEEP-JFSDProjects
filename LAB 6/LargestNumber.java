package saijavafullstackdevelopement;

public class LargestNumber {
             
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int a = 20;
		        int b = 15;
		        int c = 99;

		       int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

		        System.out.println("the largest number is: " + largest);
		    }
}
