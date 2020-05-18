package chain_of_responsibility;

public class LengthHandler extends Handler{
    @Override
    public void handleLogin(Login login) {
        if (login.getPassword().length()>=8) {
            System.out.println("Error : (login id:"+login.getLoginid()+") Your password must be less than 8 characters in length");
        }else{
            successor.handleLogin(login);
        }
    }
}
