/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pAbstrak;

/**
 *
 * @author KomangRyan
 */
public class cPersegiPanjang extends cBenda2D {
 private double p,l;
 
 public void setUkuran(double p, double l){
       
       this.p = p;
       this.l = l;
   }
   
   
   public double hitungLuas(){
    return this.p*this.l;   
   }
}
