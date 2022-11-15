/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platihan;

/**
 *
 * @author KomangRyan
 */
public class luasPersegi {
     
    
    public static double hitungLuas(double p){
        double luas;
        luas = p*p;
        return luas;
}
     public double hitungLuasLing (double r){
            return Math.PI * r * r;
        }
}

class main{
    public static void main(String[] args) {
        System.out.println("hasil"+luasPersegi.hitungLuas(9));
    }
}