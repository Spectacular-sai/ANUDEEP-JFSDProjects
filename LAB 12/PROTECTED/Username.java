package username;

public class Username {
	private String username;
    private String password;

    public Username(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void details () {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }


}
