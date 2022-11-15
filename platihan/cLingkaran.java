/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platihan;

/**
 *
 * @author KomangRyan
 */
public class cLingkaran {
 private double radius;
 
 public cLingkaran(){
     this.radius = 0;
 }
 public void setRadius(double r){
     this.radius = r ;
 }
 
 double hitungLuas(){
     return Math.PI*this.radius*this.radius;
     
 }
}
 class cTabung extends cLingkaran{
     private double tinggi ;
     
     public cTabung(){
         this.tinggi = 0 ;
     }
     
     public void setTinggi(double t){
         this.tinggi = t;
     }
     public double hitungVolume(){
         return super.hitungLuas()*this.tinggi;
     }
 }
 
 

