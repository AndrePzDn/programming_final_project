package movies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Movie {
    private int id;
    private int count;
    private String name;
    private String gender;
    private String duration;
    private String premiere;
    private String synopsis;
    private int ranking;
    private String imageDirectory;

    public Movie(int id, int count, String name, String gender, String duration, String premiere, String synopsis, int ranking, String imageDirectory){
        this.id = id;
        this.count = count;
        this.name = name;
        this.gender = gender;
        this.duration = duration;
        this.premiere = premiere;
        this.synopsis = synopsis;
        this.ranking = ranking;
        this.imageDirectory = imageDirectory;
    }

    public int getId(){
        return this.id;
    }
    public int getCount(){
        return this.count;
    }
    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }
    public String getDuration(){
        return this.duration;
    }
    public String getPremiere(){
        return this.premiere;
    }
    public String getSynopsis(){
        return this.synopsis;
    }
    public int getRanking(){
        return this.ranking;
    }
    public String getImageDirectory(){
        return this.imageDirectory;
    }
    public void setName(String name){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE movie SET name = '"+name+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.name = name;
    }
    public void setGender(String gender){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE movie SET gender = '"+gender+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.gender = gender;
    }
    public void setDuration(String duration){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE movie SET duration = '"+duration+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.duration = duration;
    }
    public void setPremiere(String premiere){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE movie SET premiere = '"+premiere+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.premiere = premiere;
    }
    public void setSynopsis(String synopsis){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE movie SET synopsis = '"+synopsis+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.synopsis = synopsis;
    }
    public void setRanking(int ranking){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE movie SET ranking = '"+ranking+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.ranking = ranking;
    }
    public void setImageDirectory(String imageDirectiry){
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            String sql2 = "UPDATE movie SET imageDirectiry = '"+imageDirectiry+"' WHERE id = "+getId()+"";
            PreparedStatement pstm= connection.prepareStatement(sql2);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.imageDirectory = imageDirectiry;
    }
}
