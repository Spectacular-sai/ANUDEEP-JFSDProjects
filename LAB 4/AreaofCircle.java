package saijavafullstackdevelopement;
import java.util.Scanner;

public class AreaofCircle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    String userinput;
	        
	    System.out.println(" enter 'yes' to continue ");
	    userinput = sc.nextLine();
	    if (userinput.equals("yes") ) {
	           
	    System.out.println("Enter the radius of the circle:");}
	    else {
	        	System.out.println("error !please enter 'yes' to continue ");
	    }
	    int radius = sc.nextInt();
	    double area = Math.PI * radius * radius;
	    System.out.println("The area of the circle with radius " + radius + " is " + area);
	}
  }
