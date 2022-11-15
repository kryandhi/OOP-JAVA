/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platihan;

/**
 *
 * @author KomangRyan
 */
public class cGaji {
    private String nama;
    private int golongan;
    
    public cGaji(){
        this.nama = " Karyawan";
        this.golongan = 1;
    }
    public cGaji(String nm,int gol){
        this.nama = nm;
        this.golongan = golongan;
    }
    
    public void setNama(String nm){
        nama = nm;
    }
    public void setGolongan(int gol){
        golongan = gol;
    }
    public int hitungGaji(){
        int gaji;
        if (golongan == 1)
            gaji = 250;
        else if(golongan == 2)
            gaji = 500;
        else 
            gaji = 750;
            
            return gaji;
            
    }
    
    public int getGaji(){
        return hitungGaji();
    }
    
    public String getNama (){
        return nama;
    }
    
    public int getGolongan(){
        return golongan;
    }
}
