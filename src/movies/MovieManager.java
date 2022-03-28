package movies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MovieManager {

    int id;
    int count;

    public void createMovie(String name, String gender, String duration, String premiere, String synopsis){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql1 = "SELECT * FROM movie";
            Statement statement = connection.createStatement();
            ResultSet result1 = statement.executeQuery(sql1);
            while(result1.next()){
                this.id = result1.getInt("id");
                this.count = result1.getInt("count");
            }
            String sql2 = "INSERT INTO movie VALUES('"+(this.id+1)+"','"+name+"','"+gender+"','"+duration+"','"+premiere+"','"+synopsis+"','0','0')";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void removeMovie(String name){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "DELETE FROM movie WHERE name='"+name+"'";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateMovie(int id, String toUpdate, String update){
        String sql2; 
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            sql2 = "UPDATE movie SET "+toUpdate+" = '"+update+"' WHERE id = "+id+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Movie readMovie(String movieName){
        Connection connection;
        Movie movie = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql1 = "SELECT * FROM movie";
            Statement statement = connection.createStatement();
            ResultSet result1 = statement.executeQuery(sql1);
            while(result1.next()){
                this.id = result1.getInt("id");
                String name = result1.getString("name");
                String gender = result1.getString("gender");
                String duration = result1.getString("duration");
                String premiere = result1.getString("premiere");
                String synopsis = result1.getString("synopsis");
                int ranking = result1.getInt("ranking");
                this.count = result1.getInt("count");
                if (name.equals(movieName)){
                    movie = new Movie(id, count, name, gender, duration, premiere, synopsis, ranking);
                    return movie;
                }
            }
            return movie;
        } catch (SQLException e) {
            e.printStackTrace();
            return movie;
        }
    }
}
