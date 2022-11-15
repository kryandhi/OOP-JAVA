/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author KomangRyan
 */
public class mahasiswa {
    private int nrp;
    private String nama;
    
   
    public mahasiswa(int nrp,String Nama){
        this.nrp = nrp;
        this.nama= nama;
        
    }
    
    void setnrp(int nrp){
       this.nrp = nrp;
        
    }
    
    int getnrp(){
        return this.nrp;
        
    }
    
    void setnama(){
        nama = nama;
        
    }
    
    String getnama(){
        return this.nama;
    }
}
