package users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BasicFunctionOfUsers {

    public int id;
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
    public void singUp(String userEmail, String userName, String password, String userNickName, String userGender){
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql1 = "SELECT * FROM userClient";
            Statement statement = connection.createStatement();
            ResultSet result1 = statement.executeQuery(sql1);
            while(result1.next()){
                this.id = result1.getInt("id");
            }
            String sql2 = "INSERT INTO userClient VALUES("+(this.id+1)+",0,0,'"+userEmail+"','"+userName+"','"+password+"','"+userNickName+"','"+userGender+"')";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
        }
    }
}
