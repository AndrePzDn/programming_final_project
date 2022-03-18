import users.User;
import users.UserAdmin;
import users.UserClient;
import users.BasicFunctionOfUsers;

public class App {
    public static void main(String[] args){
        BasicFunctionOfUsers ls = new BasicFunctionOfUsers();
        ls.singUp(123, "perdurandy@hotmail.com", "Andre", "12345678", "AndrePzDn", "Male");
        ls.singUp(12123, "eeeemail", "nameasd", "userPassword1da", "nickNamesdv", "genderasv");
        User us = ls.logIn("perdurandy@hotmail.com", "12345678");
        if (us.getClass().toString().equalsIgnoreCase("class users.UserClient")){
            UserClient userClient = (UserClient) us;
            System.out.println(userClient.getName());
        }else{
            UserAdmin userAdmin = (UserAdmin) us;
            System.out.println(userAdmin.getName());
        }
    }
}
