package movies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MovieManager {

    public int id;
    public int count;

    public void createMovie(String name, String gender, String duration, String premiere, String synopsis, String imageDirectory){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/databaseMovies.db");
            String sql1 = "SELECT * FROM movie";
            Statement statement = connection.createStatement();
            ResultSet result1 = statement.executeQuery(sql1);
            while(result1.next()){
                this.id = result1.getInt("id");
                this.count = result1.getInt("count");
            }
            String sql2 = "INSERT INTO movie VALUES('"+(this.id+1)+"','"+name+"','"+gender+"','"+duration+"','"+premiere+"','"+synopsis+"','0','0','"+imageDirectory+"')";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void removeMovie(String name){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/databaseMovies.db");
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
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/databaseMovies.db");
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
            connection = DriverManager.getConnection("jdbc:sqlite:src/database/databaseMovies.db");
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
                String imageDirectory = result1.getString("imageDirectory");
                if (name.equals(movieName)){
                    movie = new Movie(id, count, name, gender, duration, premiere, synopsis, ranking, imageDirectory);
                    return movie;
                }
            }
            return movie;
        } catch (SQLException e) {
            e.printStackTrace();
            return movie;
        }
    }
    public boolean verifyNameOfMovie(int movieId){
        boolean message = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/databaseMovies.db");
            String sql1 = "SELECT * FROM movie WHERE id=1;";
            Statement statement = connection.createStatement();
            ResultSet result1 = statement.executeQuery(sql1);
            while(result1.next()){
                int id = result1.getInt("id");
                if (id == movieId){
                    message = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return message;
    }
    public void showMovies(){
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:src/database/databaseMovies.db");
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
                this.count = result1.getInt("count");
                String imageDirectory = result1.getString("imageDirectory");
                System.out.println(name +" "+gender+" "+duration+" "+premiere+" "+imageDirectory);
                System.out.println(synopsis);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
