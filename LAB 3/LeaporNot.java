package saijavafullstackdevelopement;
import java.util.Scanner;

public class LeaporNot {
    	public static boolean isLeaporNot(int year) {

            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    	}
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();
            scanner.close();
            if (isLeaporNot(year)) {
                System.out.println(year + " is a leap year.");
            } 
            else {
                System.out.println(year + " is not a leap year.");
            }
        }
}