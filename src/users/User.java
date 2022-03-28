package users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class User {
    private int id;
    private String name;
    private String email;
    private String userPassword;
    private String nickName;
    private String gender;

    public User(int id, String email, String name, String userPassword, String nickName, String gender){
        this.id = id;
        this.email = email;
        this.userPassword = userPassword;
        this.nickName = nickName;
        this.gender = gender;
        this.name = name;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getUserPassword(){
        return this.userPassword;
    }
    public String getNickname(){
        return this.nickName;
    }
    public String getGender(){
        return this.gender;
    }
    public void setName(String name){
        this.name = name;
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE userClient SET name = '"+name+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void setEmail(String email){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE userClient SET gender = '"+email+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.email = email;
    }
    public void setUserPassword(String userPassword){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE userClient SET userPassword = '"+userPassword+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.userPassword = userPassword;
    }
    public void setNickname(String nickname){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE userClient SET nickname = '"+nickname+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.nickName = nickname;
    }
}
