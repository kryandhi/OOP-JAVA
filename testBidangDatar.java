/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author KomangRyan
 */
public class testBidangDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cBidangDatar kotak = new cBidangDatar();
        
        double hasil;
       hasil= kotak.hitungLuas(3.0, 2.0);
        System.out.println("Luas pp " + hasil);
        System.out.println("Luas pp2 "+ kotak.hitungLuas(5.0, 7.0));
        System.out.println("Luas Link "+ kotak.hitungLuasLing(7.0));
    }
    
}
