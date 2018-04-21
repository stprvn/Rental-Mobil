/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mtauf
 */
public class DatabaseConnection {
    String host,username,pass;
    public DatabaseConnection(){
        this.host="jdbc:mysql://localhost:3306/rental_mobil";
        this.username="root";
        this.pass="";
    }

   
    public Connection getConnection(){
        Connection con;
        try{
            con=(Connection) DriverManager.getConnection(host, username, pass);
            System.out.println("Connect!");
            return con;
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database not connected!");
            return null;
        }
    }
}
