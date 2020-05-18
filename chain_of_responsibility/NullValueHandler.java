package chain_of_responsibility;

public class NullValueHandler extends Handler{
    @Override
    public void handleLogin(Login login) {
        if (login.getPassword()==null || login.getPassword().equals("")) {
            System.out.println("Error : (login id:"+login.getLoginid()+") The password you entered is null. Please enter a valid password");
        }else{
            successor.handleLogin(login);
        }
    }
}
