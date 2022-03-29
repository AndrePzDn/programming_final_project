/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author fundacion
 */
public class ScoreManager {
    public int id;
    public int score;
    public String name;

    public void createScore(int score,String name){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/score.db");
            String sql1 = "SELECT * FROM idk";
            Statement statement = connection.createStatement();
            ResultSet result1 = statement.executeQuery(sql1);
            while(result1.next()){
                this.id = result1.getInt("id");
                this.score = result1.getInt("score");
                this.name =result1.getString("name");
            }
            String sql2 = "INSERT INTO idk VALUES('"+(this.id+1)+"','"+(score)+"','"+(name)+"')";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
