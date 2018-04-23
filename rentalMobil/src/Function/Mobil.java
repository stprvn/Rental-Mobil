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
public class Mobil {
    private String id,noPolisi,nama,image;
    private int harga;
    public Mobil(String id, String noPolisi, String nama, String image, int harga){
        this.id=id;
        this.noPolisi=noPolisi;
        this.nama=nama;
        this.image=image;
        this.harga=harga;
    }
    public String getId(){
        return id;
    }
    public String getNoPolisi(){
        return noPolisi;
    }
    public String getNama(){
        return nama;    
    }
    public String getImage(){
        return image;
    }
    public int getHarga(){
        return harga;
    }
}
