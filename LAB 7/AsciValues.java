package saijavafullstackdevelopement;
import java.util.Scanner;

public class AsciValues {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any character: ");
        char C = scanner.next().charAt(0);

       
        int a = (int) C;

        System.out.println(a );
	}
		
	}


