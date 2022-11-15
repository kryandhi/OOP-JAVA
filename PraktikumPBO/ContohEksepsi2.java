/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author KomangRyan
 */

public class ContohEksepsi2 {
    public static void main(String[] args) {
        int pembilang = 7;
        int penyebut = 0;
        try{
            int hasil = pembilang / penyebut;
            System.out.println("hasil = "+hasil);
        }
        catch(Exception e){
            System.out.println("Kesalahan : " + "Terdapat pembagian dengan nol");
        }
        System.out.println("Statement setelah blok trycatch");
    }
   
}
