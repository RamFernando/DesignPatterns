package chain_of_responsibility;

public class FormatHandler extends Handler{
    @Override
    public void handleLogin(Login login) {

        if (!(login.getPassword().matches("([A-Z&0-9])\\w+"))) {
            System.out.println("Error : (login id:"+login.getLoginid()+") Worng format of your password. Cannot contain special characters");
        }else{
            System.out.println("Success : (login id:"+login.getLoginid()+") Your login saved successfully");
        }
    }
}
