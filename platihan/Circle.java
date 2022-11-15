/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platihan;

/**
 *
 * @author KomangRyan
 */
public class Circle {
    private double radius;
    
   public Circle(double radius1){
       radius = radius1;
   }
   public void setRadius(double radius1){
       radius = radius1;
   }
   public double getRadius(){
       return radius;
   }
   
   public double getArea(){
       return radius*radius*Math.PI;
       
   }
    
}

class B extends Circle{
    private double length;
    
    public B(double radius1, double length1){
       super(radius1);
        length = length1;
    }
    
    public double getArea(){
        return getArea()*length;
        
    }
    public static void main(String[] args) {
        Circle k1 = new Circle(15);
        System.out.println(k1.getArea());
    }
    }



