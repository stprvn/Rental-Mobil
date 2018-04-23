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
public class DriverData extends Orang{
    private String id,image;
    public DriverData(String nama, String nik,String id,String image) {
        super(nama, nik);
        this.id=id;
        
    }
    
    @Override
    public String getNama(){
        return nama;
    }
    public String getNik(){
        return nik;
    }
    public String getId(){
        return id;
    }
    public String getImage(){
        return image;
    }
}
