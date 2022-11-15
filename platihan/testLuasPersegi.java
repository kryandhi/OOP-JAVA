/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platihan;

/**
 *
 * @author KomangRyan
 */
public class testLuasPersegi {
    public static void main(String[] args) {
        luasPersegi kotak = new luasPersegi();
        double hasil;
       hasil= kotak.hitungLuas(3);
        
        System.out.println("luas "+hasil);
        System.out.println("luas 2 " + kotak.hitungLuas(8));
        System.out.println("luas ling "+ kotak.hitungLuasLing(3));
    }
    
    
    
    
}
