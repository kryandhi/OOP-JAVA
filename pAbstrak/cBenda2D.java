/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pAbstrak;

/**
 *
 * @author KomangRyan
 */
public abstract class cBenda2D {
   private String warna;
   
   public void setWarna(String w){
       
       this.warna = w;
       
   }
   public String getWarna(){
       return this.warna;
   }
   
   public abstract double hitungLuas();
      
}

