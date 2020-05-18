package chain_of_responsibility;

public class Login {
    private int loginid;
    private String username;
    private String password;

    public Login(int loginid, String username, String password) {
        this.loginid = loginid;
        this.username = username;
        this.password = password;
    }

    public int getLoginid() {
        return loginid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
