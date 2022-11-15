/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platihan;

/**
 *
 * @author KomangRyan
 */
public class ujiGaji {
    public static void main(String[] args) {
         cGaji o = new cGaji("paijo",2);
         cGaji o2 = new cGaji("ahmad ",3);
         o.setNama(" Joko  ");
        o.setGolongan(2);
        o2.setGolongan(3);
        System.out.println("gajinya " + o.getGaji());
         System.out.println("Nama = " + o2.getNama());
         System.out.println("Golongan "+ o2.getGolongan());
    }
}
