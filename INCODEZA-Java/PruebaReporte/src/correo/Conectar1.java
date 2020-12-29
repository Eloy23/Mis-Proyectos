package correo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar1 {
    Connection conectar = null;
    public Connection conexion(){
        try{
          Class.forName("com.mysql.jdbc.Driver");
          conectar = DriverManager.getConnection("jdbc:mysql://localhost/prueba", "root", "");
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
        return conectar;
    }
    
}