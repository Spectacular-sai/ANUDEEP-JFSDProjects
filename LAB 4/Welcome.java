package saijavafullstackdevelopement;
import java.util.Scanner;


public class Welcome {
	
	public static void main(String args[])
	{
      String name;
      
      System.out.println("Enter ur name");
      
      Scanner sc= new Scanner(System.in);
      
      name=sc.next();
      
      System.out.println("Welcome"+ name);
	}
    }
