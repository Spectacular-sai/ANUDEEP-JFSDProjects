package saijavafullstackdevelopement;

	public class EmployeeDetails {   // by using static variable and static method 
		static int id =1;
		static String name = "Saikumar" ; 
		static String companyName = "ANUDEEP"; 
		 public static void displayEmployeeDetails() {
			// TODO Auto-generated method stub
			System.out.println("Employee ID: "+id);
			System.out.println("Employee name: "+name);
			System.out.println("Company Name: " + companyName); }
			//sop(Demo.x);
			 public static void main(String[] args) {
			        // Call the new method to display employee info
			        displayEmployeeDetails();
		}

	}
