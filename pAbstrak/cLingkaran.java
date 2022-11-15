/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pAbstrak;

/**
 *
 * @author KomangRyan
 */
public class cLingkaran extends cBenda2D {
    private double jari;
    
    public void setJari(double r){
       
       this.jari = r;
       
   }
   public double getJari(){
       return this.jari;
   }

public double hitungLuas(){
        return Math.PI*this.jari*this.jari;
     
}
    
}
