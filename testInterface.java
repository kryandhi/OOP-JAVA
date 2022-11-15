/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author KomangRyan
 */
public class testInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persegi pp ;
        pp = new persegi();
        pp.setLebar(10);
        pp.setPanjang(20);
        System.out.println("area pp ; "+pp.area());
        System.out.println("warna pp : "+pp.warna());
    }
    
}
