package users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import movies.Movie;
import movies.MovieManager;

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
    public void adminProgram(){
        String movieName;
        String movieGender;
        String duration;
        String premiere;
        String synopsis;
        String imageDirectory;
        String update;
        String function;
        String movieToUpdate;
        Scanner sc = new Scanner(System.in);
        MovieManager movieManager = new MovieManager();
        boolean run = true;
        while (run){
            try {
                System.out.println("Elija una opcion\n1. Añadir una pelicula\n2. Actualizar pelicula \n3. Ver Peliculas\n0. Salir");
                int option = sc.nextInt();
                if(option == 1){
                    System.out.println("Usted selecciono añadir una pelicula");
                    System.out.println("Introduzca el nombre de la pelicula: ");
                    movieName = sc.nextLine();
                    System.out.println("Introduzca el genero de la pelicula");
                    movieGender = sc.nextLine();
                    System.out.println("Introduzca la duracion de la pelicula: ");
                    duration = sc.nextLine();
                    System.out.println("Introduzca el estreno la pelicula (Ej. 28 de marzo de 2022)");
                    premiere = sc.nextLine();
                    System.out.println("Introduzca la sinopsis de la pelicula: ");
                    synopsis = sc.nextLine();
                    System.out.println("Introduzca el directorio de la imagen de la pelicula");
                    imageDirectory = sc.nextLine();
                    movieManager.createMovie(movieName, movieGender, duration, premiere, synopsis, imageDirectory);
                }else if(option == 2){
                    System.out.println("Usted selecciono actualizar pelicula");
                    System.out.println("Introduzca el nombre de pelicula que desea editar");
                    movieToUpdate = sc.nextLine();
                    if (movieManager.verifyNameOfMovie(movieToUpdate).equalsIgnoreCase("Correct")){
                        Movie movie = movieManager.readMovie(movieToUpdate);
                        System.out.println("Que atributo desea cambiar");
                        function = sc.nextLine();
                        System.out.println("Por que valor se cambiara");
                        update = sc.nextLine();
                        movieManager.updateMovie(movie.getId(), function, update);
                    }else {
                        System.out.println(movieManager.verifyNameOfMovie(movieToUpdate));
                    }

                }else if (option == 3){
                    movieManager.showMovies();
                }else if (option == 0){
                    run = false;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        sc.close();
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
