/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author KomangRyan
 */
public class ImplementasiMethodNonVoid {
    public static void main(String[] args) {
        Karyawan karyawan001 = new Karyawan();
        
        karyawan001.ID = "K001";
        karyawan001.nama = "Agus Ramadhan";
        karyawan001.divisi = "Keuangan";
        karyawan001.gaji = 1850000;
        
        karyawan001.cetakData();
        
        System.out.println("Sumbangan Zakat : "+ karyawan001.hitungSumbanganZakat());
    }
}
