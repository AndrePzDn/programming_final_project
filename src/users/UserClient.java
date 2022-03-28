package users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserClient extends User {

    private int points;
    private int cups;

    public UserClient(int id, int points, int cups, String email, String name, String userPassword, String nickName, String gender){
        super(id, email, name, userPassword, nickName, gender);
        this.points = points;
        this.cups = cups;
        
    }
    public int getPoints(){
        return this.points;
    }
    public int getCups(){
        return this.cups;
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
            String sql2 = "UPDATE userCLient SET gender = '"+cups+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.cups = cups;
    }
}
