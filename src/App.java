import users.User;
import users.UserAdmin;
import users.UserClient;
import users.BasicFunctionOfUsers;
import Windows.Window1;
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
	Window1 Interface1 = new Window1();
        
        Interface1.setVisible(true);
    }
}
