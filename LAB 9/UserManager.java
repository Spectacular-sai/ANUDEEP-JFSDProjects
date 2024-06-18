package saijavafullstackdevelopement;
import java.util.Scanner;

public class UserManager {
	void authenticate1(String username, String password) {
        System.out.println(username + " YOUR login successful.");
    }

    void authenticate2(String email, String emailpassword) {
        System.out.println(email + " YOUR login successful using EmailId.");
    }

    void authenticate3(long phoneno, int pin) {
        System.out.println(phoneno + " :YOUR login successful using phoneN. ");
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        UserManager u = new UserManager();
        u.authenticate1("SaiKumar:", "123456");
        u.authenticate2("saikumargudiboina99@gmail.com:", "789");
        u.authenticate3(949350492, 12345);
    }

}
