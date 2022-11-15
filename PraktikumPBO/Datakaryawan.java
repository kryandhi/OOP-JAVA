/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author KomangRyan
 */
public class Datakaryawan {
    public static void main(String[] args) {
        Karyawan karyawan001 = new Karyawan();
        Karyawan karyawan002 = new Karyawan();
         Karyawan karyawan003 = new Karyawan();
         
         karyawan001.nama = "ryan";
         karyawan001.ID = "G1";
         karyawan001.divisi = "Internal";
         karyawan001.gaji = 25000;
         
         karyawan002.nama = "budi";
         karyawan002.ID = "G2";
         karyawan002.divisi = "PSDM";
         karyawan002.gaji = 35000;
         
         karyawan003.nama = "Lutfi";
         karyawan003.ID = "G3";
         karyawan003.divisi = "event";
         karyawan003.gaji = 33000;
    }
}
