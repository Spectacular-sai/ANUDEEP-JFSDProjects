package bank;

public class Bank {
	 private String bankname;
	    private int accountnumber;
	    protected int ifsccode;

	    public Bank(String bankname, int accountnumber, int ifsccode) {
	        this.bankname = bankname;
	        this.accountnumber = accountnumber;
	        this.ifsccode = ifsccode;
	    }

	    public void Bankname() {
	        System.out.println("Bank Name: " + bankname);
	    }

	    public void Accountnumber() {
	        System.out.println("Account Number: " + accountnumber);}
	        public void Ifsccode() {
	            System.out.println("IFSC Code: " + ifsccode);
	        }
	    }
