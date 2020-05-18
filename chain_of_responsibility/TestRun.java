package chain_of_responsibility;

public class TestRun {
    public static void main(String[] args) {

        NullValueHandler nullValueHandler = new NullValueHandler();
        LengthHandler lengthHandler = new LengthHandler();
        FormatHandler formatHandler = new FormatHandler();
        BasicHandler basicHandler = new BasicHandler();

        basicHandler.setSuccessor(nullValueHandler);
        nullValueHandler.setSuccessor(lengthHandler);
        lengthHandler.setSuccessor(formatHandler);


        Login login = new Login(1,"Ramesha","");
        basicHandler.handleLogin(login);

        Login login1 = new Login(2,"Sanduni","123456789");
        basicHandler.handleLogin(login1);

        Login login2 = new Login(3,"Sandali","!@#$%^");
        basicHandler.handleLogin(login2);

        Login login3 = new Login(4,"Isuri","12dfd");
        basicHandler.handleLogin(login3);
    }
}
