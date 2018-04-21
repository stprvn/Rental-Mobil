/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmobil;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author LABKOM-43
 */
public class DBrental {
    private static Connection con;
    private static Statement stmt = null;
    
    public boolean connect (String host, String user, String pass){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://"
                    + host
                    + "/rental_mobil?username="
                    + user
                    + "&password="
                    + pass;
            con = (Connection) DriverManager.getConnection(connectionUrl);
            System.out.println("terkoneksi");
        } catch (Exception e) {
            System.out.println("ada yang salah");
        }
        return false;
    }
    
    public boolean connect (String host, String user){
        if (connect(host, user,"")) {
            return true;
        }
        return false;
    }
    
    public static void exec (String query){
        try {
            stmt = (Statement) con.createStatement();
            int rowsEffected = stmt.executeUpdate(query);
            System.out.println(rowsEffected+ "baris data berubah");
        } catch (Exception e) {
            System.out.println("exec ada yang salah");
        }
    }
    
    public static ResultSet login(String query){
        ResultSet rs = null;
        try {
            stmt = (Statement) con.createStatement();
            rs = stmt.executeQuery(query);
            return rs;
        } catch (Exception e) {
            System.out.println("RS ada yang salah");
        }
        return null;
    }
}

