
package movies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Score {
    private int id;
    private int score;
    private String name;


    public Score(int id, int score,String name){
        this.id = id;
        this.score = score;
        this.name=name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
             try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/score.db");
            String sql2 = "UPDATE idk SET score = '"+score+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/score.db");
            String sql2 = "UPDATE idk SET name= '"+name+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.name = name;
    }
    
 }

    


