/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platihan;

/**
 *
 * @author KomangRyan
 */
public class vektor2D {
 private int x, y;
 
 public vektor2D(){
     this.x=0;
     this.y=0;
 }
 public vektor2D(int x, int y){
     this.x= x;
     this.y=y;
     
 }
 public int getx(){
     return this.x;
 }
 public int gety(){
     return this.y;
 }
 public void display(){
     System.out.println("x"+getx());
     System.out.println("y"+gety());
 }
 
 public vektor2D sumVec(vektor2D v1){
     
     vektor2D temp = new vektor2D();
     
     temp.x = this.x + v1.x;
     temp.y = this.y + v1.y;
     return temp;
 }
 
 public boolean isVektorNol(){
     boolean hasil;
     if (this.x==0&&this.y==0)
         hasil = true;
     else
         hasil = false;
     return hasil;
    
 }
 
}
