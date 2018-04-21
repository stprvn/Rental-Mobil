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
            rs=st.executeQuery("SELECT * FROM loginvoter");
            Member member;
            while(rs.next()){
                member = new Member(rs.getString("nama_member"), rs.getString("nik"), rs.getString("username"), rs.getString("password"));
                listArrayDataLogin.add(member);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return listArrayDataLogin;
    }
}
