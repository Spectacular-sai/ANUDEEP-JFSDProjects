package atm;
import bank.Bank;

public class Atm {
	
	
	    public static void main(String[] args) {
	    	 Bank account = new  Bank("SBI", 123456789,5522);
	        account.Bankname(); 
	        account.Accountnumber();
	        account.Ifsccode();
	    }
}

	
