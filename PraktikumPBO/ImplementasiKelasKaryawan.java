/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author KomangRyan
 */
public class ImplementasiKelasKaryawan {
    public static void main(String[] args) {
        Karyawan Aurel = new Karyawan ();
        
        Aurel.ID ="K001";
        Aurel.nama = "Marketing";
        Aurel.gaji = 2500000;
        
        System.out.println("Data karyawan");
        System.out.println("ID : " + Aurel.ID);
        System.out.println("Nama : " + Aurel.nama);
        System.out.println("Gaji : " + Aurel.gaji);
        
        
    }
}
