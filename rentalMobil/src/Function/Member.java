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
public class Member extends Orang{
    protected String username,password;
    public Member(String nama, String nik, String username,String password) {
        super(nama, nik);
        this.username=username;
        this.password=password;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    
}
