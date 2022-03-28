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
        try {
        String movieGender, duration, premiere, synopsis, imageDirectory, update, movieToUpdate;
        int option;
        Scanner sc = new Scanner(System.in);
        MovieManager movieManager = new MovieManager();
        boolean run = true;
        while (run){
                System.out.println("Elija una opcion\n1. Añadir una pelicula\n2. Actualizar pelicula \n3. Ver Peliculas\n0. Salir");
                option = sc.nextInt();
                if(option == 1){
                    System.out.println("Usted selecciono añadir una pelicula");
                    String movieName = sc.nextLine();
                    System.out.println("Introduzca el nombre de la pelicula");
                    String asd = sc.nextLine();
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
                    movieManager.createMovie(asd, movieGender, duration, premiere, synopsis, imageDirectory);
                }else if(option == 2){
                    System.out.println("Usted selecciono actualizar pelicula\nIntroduzca el id de pelicula que desea editar");
                    int movieId = sc.nextInt();
                    movieToUpdate = sc.nextLine();
                    if (movieManager.verifyNameOfMovie(movieId)){
                        System.out.println("Que atributo desea cambiar\n1.Nombre\n2.Genero\n3.Duracion\n4.Premiere\n5.Sinopsis\n6.Image Directory");
                        option = sc.nextInt();
                        if (option == 1){
                            System.out.println("Nuevo nombre:");
                            String movieName = sc.nextLine();
                            String newValue = sc.nextLine();
                            movieManager.updateMovie(movieId, "name", newValue);
                        }else if (option == 2){
                            System.out.println("Nuevo gender:");
                            String movieName = sc.nextLine();
                            String newValue = sc.nextLine();
                            movieManager.updateMovie(movieId, "gender", newValue);
                        }else if (option ==3){
                            System.out.println("Nuevo duracion:");
                            String movieName = sc.nextLine();
                            String newValue = sc.nextLine();
                            movieManager.updateMovie(movieId, "duration", newValue);
                        }else if (option == 4){
                            System.out.println("Nuevo premiere:");
                            String movieName = sc.nextLine();
                            String newValue = sc.nextLine();
                            movieManager.updateMovie(movieId, "premiere", newValue);
                        }else if (option ==5){
                            System.out.println("Nueva sisnopsis:");
                            String movieName = sc.nextLine();
                            String newValue = sc.nextLine();
                            movieManager.updateMovie(movieId, "synopsis", newValue);
                        }else if (option == 6){
                            System.out.println("Nuevo valor:");
                            String movieName = sc.nextLine();
                            String newValue = sc.nextLine();
                            movieManager.updateMovie(movieId, "imageDirectory", newValue);
                        }else{
                            System.out.println("Opcion no valida");
                        }
                    }else {
                        System.out.println("Id invalido");
                    }

                }else if (option == 3){
                    movieManager.showMovies();
                }else if (option == 0){
                    run = false;
                }
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
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
