package saijavafullstackdevelopement;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner scanner = new Scanner (System.in);
	     System.out.println("Enter the  number of prime numbers you want");
	     int n = scanner.nextInt();
	     for (int i=2;i<=n;i++) {
	    	 for (int num = 2; num <= n; num++) {
	             if (isPrime(num)) {
	                 System.out.print(num + " ");
	             }
	         }

	     }
		}
	     
	     public static boolean isPrime(int n) {
	         if (n <= 1) {
	             return false;
	         }
	         for (int i = 2; i * i <= n; i++) {
	             if (n % i == 0) {
	                 return false;
	             }
	         }
	         return true;
	}
	

}
