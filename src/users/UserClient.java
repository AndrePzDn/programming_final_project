package users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserClient extends User {

    private int points;
    private int cups;
    private int login;

    public UserClient(int id, int points, int cups, String email, String name, String userPassword, String nickName, String gender, int login){
        super(id, email, name, userPassword, nickName, gender);
        this.points = points;
        this.cups = cups;
        this.login = login;
        
    }
    public int getPoints(){
        return this.points;
    }
    public int getCups(){
        return this.cups;
    }
    public int getLogin(){
        return this.login;
    }
    public void setPoints(int points){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE userClient SET points = '"+points+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.points = points;
    }
    public void setCups(int cups){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE userCLient SET cups = '"+cups+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.cups = cups;
    }
    public void setLogin(int login){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE userCLient SET login = '"+login+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.login = login;
    }
}
