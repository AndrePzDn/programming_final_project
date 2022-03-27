package users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BasicFunctionOfUsers {

    ArrayList<User> userList;

    public BasicFunctionOfUsers(){
        ArrayList<User> list = new ArrayList<User>();
        this.userList = list;
    }
    public User logIn(String userEmail, String password){
        User user = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql1 = "SELECT * FROM userClient";
            Statement statement = connection.createStatement();
            ResultSet result1 = statement.executeQuery(sql1);
            while(result1.next()){
                int id = result1.getInt("id");
                int points = result1.getInt("points");
                int cups = result1.getInt("cups");
                String email = result1.getString("email");
                String userPassword = result1.getString("userPassword");
                String nickName = result1.getString("nickName");
                String gender = result1.getString("gender");
                String name = result1.getString("name");
                if ((email.equalsIgnoreCase(userEmail)) && (userPassword.equalsIgnoreCase(password))){
                    user = new UserClient(id, points, cups, email, name, userPassword, nickName, gender);
                    return user;
                }
            }
            String sql2 = "SELECT * FROM userAdmin";
            ResultSet result2 = statement.executeQuery(sql2);
            while(result2.next()){
                int id = result2.getInt("id");
                String email = result2.getString("email");
                String userPassword = result2.getString("userPassword");
                String nickName = result2.getString("nickName");
                String gender = result2.getString("gender");
                String name = result2.getString("name");
                if ((email.equalsIgnoreCase(userEmail)) && (userPassword.equalsIgnoreCase(password))){
                    user = new UserAdmin(id, email, name, userPassword, nickName, gender);
                    return user;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    public void singUp(String email, String name, String userPassword, String nickName, String gender){
        int size = this.userList.size()-1;
        this.userList.get(size);
        User user = new UserClient(size+1, 0, 0, email, name, userPassword, nickName, gender);
        userList.add(user);
        size = this.userList.size()-1;
    }
}
