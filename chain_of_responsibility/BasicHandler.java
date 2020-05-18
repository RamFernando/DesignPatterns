package chain_of_responsibility;

public class BasicHandler  extends Handler{
    @Override
    public void handleLogin(Login login) {
        successor.handleLogin(login);
    }
}
