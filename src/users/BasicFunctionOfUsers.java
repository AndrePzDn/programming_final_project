package users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicFunctionOfUsers {

    public int id;

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
                int login = result1.getInt("login");
                if ((email.equalsIgnoreCase(userEmail)) && (userPassword.equalsIgnoreCase(password))){
                    user = new UserClient(id, points, cups, email, name, userPassword, nickName, gender, login);
                    String sql = "UPDATE userClient SET login = 1 WHERE email='"+email+"'";
                    PreparedStatement pstm= connection.prepareStatement(sql);
                    pstm.execute();
                    connection.close();
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
                    connection.close();
                    return user;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    public void singUp(String userEmail, String userName, String password, String userNickName, String userGender){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql1 = "SELECT * FROM userClient";
            Statement statement = connection.createStatement();
            ResultSet result1 = statement.executeQuery(sql1);
            while(result1.next()){
                this.id = result1.getInt("id");
            }
            String sql2 = "INSERT INTO userClient VALUES("+(this.id+1)+",0,0,'"+userEmail+"','"+userName+"','"+password+"','"+userNickName+"','"+userGender+"',0)";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public String getNickNameOfUserLogged(){
        String nickname = "asd";
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql = "SELECT nickName FROM userCLient WHERE login=1";
            Statement statement = connection.createStatement();
            ResultSet result1 = statement.executeQuery(sql);
            while(result1.next()){
                String nickName = result1.getString("nickName");
                connection.close();
                return nickName;
                }
            connection.close();
            return nickname;
        } catch (SQLException e) {
            e.printStackTrace();
            return nickname;
        }
    }
    public void logOut(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE userCLient SET login = '0' WHERE login=1";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
