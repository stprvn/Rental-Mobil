/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

/**
 *
 * @author mtauf
 */
public class Admin {
    private String nama,username,password;
    public Admin(String nama, String username, String password){
        this.nama=nama;
        this.username=username;
        this.password=password;
    }
    public String getNama(){
        return nama;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
}
