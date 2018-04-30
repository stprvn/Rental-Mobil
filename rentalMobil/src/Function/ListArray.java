/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author mtauf
 */
public class ListArray {
        DatabaseConnection datacon = new DatabaseConnection();
        private Connection con;
        
    public ArrayList<Member> getListDataMembers(){
        ArrayList<Member> listArrayDataLogin = new ArrayList<>();
        con=datacon.getConnection();
        Statement st;
        ResultSet rs;
        try{
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM member");
            Member member;
            while(rs.next()){
              //  member = new Member(rs.getInt("id_member"),rs.getString("nama_member"),rs.getString("username"), rs.getString("password"));
            //    listArrayDataLogin.add(member);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listArrayDataLogin;
    }
    public ArrayList<Admin> getListDataAdmin(){
        ArrayList<Admin> listArrayDataLogin = new ArrayList<>();
        con=datacon.getConnection();
        Statement st;
        ResultSet rs;
        try{
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM admin");
            Admin admin;
            while(rs.next()){
                admin = new Admin(rs.getString("nama_admin"),rs.getString("username"),rs.getString("password"));
                listArrayDataLogin.add(admin);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listArrayDataLogin;
    }
    
    public ArrayList<DriverData> getListDataDriver(){
        ArrayList<DriverData> listArrayDataLogin = new ArrayList<>();
        con=datacon.getConnection();
        Statement st;
        ResultSet rs;
        try{
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM driver");
            DriverData driver;
            while(rs.next()){
                driver = new DriverData(rs.getString("nama_driver"), rs.getString("nik_driver"), rs.getString("id_driver"),rs.getString("gambar"));
                listArrayDataLogin.add(driver);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listArrayDataLogin;
    }
    public ArrayList<Mobil> getListDataMobil(){
        System.out.println("load!");
        ArrayList<Mobil> listArrayDataMobil = new ArrayList<>();
        con=datacon.getConnection();
        Statement st;
        ResultSet rs;
        try{
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM mobil");
            Mobil mobil;
            while(rs.next()){
                mobil = new Mobil(rs.getString("id_mobil"), rs.getString("no_polisi"), rs.getString("nama_mobil"), rs.getString("gambar"), rs.getInt("harga"));
                listArrayDataMobil.add(mobil);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listArrayDataMobil;
    }
}
