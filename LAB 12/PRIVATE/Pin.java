package bank;

public class Pin {
	private int pinNumber;

    public Pin(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public void printPin() {
        System.out.println("PIN: " + pinNumber);
    }

}