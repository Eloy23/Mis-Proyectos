/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.*;
import java.sql.DriverManager; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Eloy
 */
/*public class Conexion {
//Connection conexion=null;
Connection con=null;
// Statement stmt=null;


public Connection conexion(){

try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12221227","sql12221227","w4iMpnC4kL");

//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic_1st","root","");
}
catch(Exception e){


JOptionPane.showMessageDialog(null,"Error"+e);
}
return con;
}


}*/
public class Conexion {
    static Connection cc;
   // Conexion cc=new Conexion();
    Connection Con=null;
    int marker=0;
    
    public Connection conexion(){
        System.out.println("Conecting........");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Con=DriverManager.getConnection("jdbc:mysql://localhost/electronic_1st","root","");
            System.out.println("Conectado!");
            if (marker!=0) {
                System.out.println("The DB exists, but is empty");
                tables();
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Error Al Conectar");
            alieve();
    }
        return Con;
        
}
    public void alieve(){
        System.out.println("Traying to create DB");
        try {
            System.out.println("Procesing");
            Class.forName("com.mysql.jdbc.Driver");
            Con=DriverManager.getConnection("jdbc:mysql://localhost","root","");
            String sql="CREATE DATABASE IF NOT EXISTS electronic_1st";
            Statement st = Con.createStatement();
            st.executeUpdate(sql);
            System.out.println("The DB was created succesfully");
            marker=1;
            conexion();
              
              } catch (ClassNotFoundException ex) {
                  System.out.println("Class Error");
                  Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
              } catch (SQLException ex) {
                  System.out.println("MySQL error");
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tables(){
        System.out.println("Creating Tables");
        try {
            Statement st = Con.createStatement();
String sql="CREATE TABLE `user` (\n" +
"  `id` int(11) NOT NULL,\n" +
"  `Employee_id` int(11) NOT NULL,\n" +
"  `password` varchar(30) NOT NULL,\n" +
"  `nick` varchar(15) NOT NULL,\n" +
"  `tipo` varchar(11) NOT NULL\n" +
"       \n" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1;" ;
st.executeUpdate(sql);
                        System.out.println("The table users was creted");
                        
  sql="CREATE TABLE `addinv` (\n" +
"  `id_invoice` int(11) NOT NULL,\n" +
"  `date` varchar(15) NOT NULL,\n" +
"  `id_client` int(11) NOT NULL,\n" +
"  `subtotal` varchar(100) NOT NULL,\n" +
"  `total` varchar(100) NOT NULL\n" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1;" ;
st.executeUpdate(sql);
 System.out.println("The table users was creted 1"); 

 sql="CREATE TABLE `clients` (\n" +
"  `id` int(11) NOT NULL,\n" +
"  `name` varchar(40) NOT NULL,\n" +
"  `lastname` varchar(40) NOT NULL,\n" +
"  `gender` varchar(40) NOT NULL,\n" +
"  `phone` varchar(10) NOT NULL,\n" +
"  `mail` varchar(50) NOT NULL,\n" +
"  `address` varchar(100) NOT NULL\n" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1;" ;
st.executeUpdate(sql);
 System.out.println("The table users was creted 2"); 

sql="CREATE TABLE `detinv` (\n" +
"  `ID` int(11) NOT NULL,\n" +
"  `id_inv` int(11) NOT NULL,\n" +
"  `id_product` int(11) NOT NULL,\n" +
"  `product` varchar(150) NOT NULL,\n" +
"  `quantity` varchar(150) NOT NULL,\n" +
"  `price_u` varchar(150) NOT NULL,\n" +
"  `price_v` varchar(150) NOT NULL\n" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1;" ;
st.executeUpdate(sql);
 System.out.println("The table users was creted 3"); 
sql="CREATE TABLE `employees` (\n" +
"  `Employee_id` int(11) NOT NULL,\n" +
"  `last_name` varchar(45) NOT NULL,\n" +
"  `name` varchar(50) NOT NULL,\n" +
"  `gender` varchar(30) NOT NULL,\n" +
"  `age` varchar(11) NOT NULL,\n" +
"  `phone` varchar(45) NOT NULL,\n" +
"  `mail` varchar(50) NOT NULL,\n" +
"  `Roll` varchar(45) DEFAULT NULL\n" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1;" ;
st.executeUpdate(sql);
 System.out.println("The table users was creted 4"); 

 sql="CREATE TABLE `orders` (\n" +
"  `order_id` int(11) NOT NULL,\n" +
"  `id_sell` int(11) NOT NULL,\n" +
"  `id_product` int(11) NOT NULL,\n" +
"  `produdct_name` varchar(100) NOT NULL,\n" +
"  `quantity` varchar(30) NOT NULL,\n" +
"  `unique` varchar(30) NOT NULL,\n" +
"  `total_sell` varchar(30) NOT NULL,\n" +
"  `id_employee` int(11) NOT NULL\n" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1;" ;
st.executeUpdate(sql);
 System.out.println("The table users was creted 5"); 

 sql="CREATE TABLE `productos` (\n" +
"  `id_product` int(11) NOT NULL,\n" +
"  `name` varchar(45) DEFAULT NULL,\n" +
"  `detail` varchar(100) DEFAULT NULL,\n" +
"  `price` varchar(10) DEFAULT NULL,\n" +
"  `stock` varchar(20) NOT NULL,\n" +
"  `ruta` varchar(100) NOT NULL,\n" +
"  `image` blob NOT NULL	\n" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1;" ;
st.executeUpdate(sql);
 System.out.println("The table users was creted 6"); 

 sql="CREATE TABLE `sells` (\n" +
"  `num_sell` int(11) NOT NULL,\n" +
"  `date` varchar(30) NOT NULL,\n" +
"  `subtotal` varchar(30) NOT NULL,\n" +
"  `total` varchar(30) NOT NULL\n" +
") ENGINE=InnoDB DEFAULT CHARSET=latin1;" ;
st.executeUpdate(sql);
 System.out.println("The table users was creted 7"); 
                        System.out.println("The table users was creted"); 
 sql="INSERT INTO `user` (`id`, `Employee_id`, `password`, `nick`, `tipo`) VALUES\n" +
"(20, 1, '12', 'h', 'Manager'),\n" +
"(21, 2, 'ana', 'yami', 'Empleado'),\n" +
"(24, 3, 'kike', 'kike', 'Empleado');";   
  System.out.println("The table users was inserted"); 
st.executeUpdate(sql);
                        System.out.print("."); 
                                
        } catch (Exception e) {
            System.out.println("NEL");
        }
    }
}
