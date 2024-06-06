package saijavafullstackdevelopement;

import java.util.Scanner;

public class Palindrome {
	
		public static boolean isPalindrome(int num) {
	        int reversedNum = 0, originalNum = num;
	          while (num != 0) {
	            int digit = num % 10;
	            reversedNum = reversedNum * 10 + digit;
	            num /= 10;
	        }
	           return originalNum == reversedNum;
	    }
	 public static void main(String[] args) {
		 
		    Scanner scanner= new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();
	 if (isPalindrome(number)) {
	            System.out.println(number + " is a palindrome.");
	        } else {
	            System.out.println(number + " is not a palindrome.");
	        }
	    }
	}
		
