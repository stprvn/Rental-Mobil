/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.util.ArrayList;

/**
 *
 * @author mtauf
 */
public class CheckLogin {
    String username,password;
    public CheckLogin(String username, String password){
        this.username=username;
        this.password=password;
    }
    public boolean checkLogin(){
        ListArray listArray=new ListArray();
        ArrayList<Member> list = new ArrayList<>();
        list=listArray.getListDataMembers();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getUsername().equals(username) && list.get(i).getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
