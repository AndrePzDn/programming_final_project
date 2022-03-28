package users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserAdmin extends User{
    int id;
    String email;
    String name;
    String userPassword;
    String nickName;
    String gender;
    public UserAdmin(int id, String email, String name, String userPassword, String nickName, String gender){
        super(id, email, name, userPassword, nickName, gender);
    }
    @Override
    public void setName(String name){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE userAdmin SET name = '"+name+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.name = name;
    }
    @Override
    public void setEmail(String email){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE userAdmin SET gender = '"+email+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.email = email;
    }
    @Override
    public void setUserPassword(String userPassword){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE userAdmin SET userPassword = '"+userPassword+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.userPassword = userPassword;
    }
    @Override
    public void setNickname(String nickname){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE userAdmin SET nickname = '"+nickname+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.nickName = nickname;
    }
}
