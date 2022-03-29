/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class conexion {
    String strConexionDB="jdbc:sqlite:src/database/database.db";
    Connection conn=null;
    
    public conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection(strConexionDB);
            System.out.println("Conexion establecida");
            }catch (Exception e){
                System.out.println("Error de conexion: "+e);
                
                    }
    }
    public int ejecutarsentenciaSQL(String strSecuenciaSQL){
        try {
            PreparedStatement pstm= conn.prepareStatement(strSecuenciaSQL);
            pstm.execute();
            return 1;
        }catch (SQLException e){
            System.out.println(e);
            return 0;
        }

}
    public ResultSet consultarResgistros(String strSecuenciaSQL){
    try {
         PreparedStatement pstm= conn.prepareStatement(strSecuenciaSQL);
         ResultSet respuesta= pstm.executeQuery();
         return respuesta;
         
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    
}