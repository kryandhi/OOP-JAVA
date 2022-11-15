/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author KomangRyan
 */
public class PengaruhReferensiObjek1 {
    public static void main(String[] args) {
        Karyawan Karyawan001 = new Karyawan();
        Karyawan Karyawan002 = Karyawan001;
        
        Karyawan Karyawan003 = new Karyawan();
        Karyawan Karyawan004 = new Karyawan();
        
        
        Karyawan001.nama = "Mischella";
        Karyawan001.divisi = "HRD";
        
        System.out.println("Data Karyawan001");
        System.out.println("Nama : " + Karyawan001.nama);
        System.out.println("Nama : " + Karyawan001.divisi);
        System.out.println("    ");
        System.out.println("Data Karyawan002");
        System.out.println("Nama : " + Karyawan002.nama);
        System.out.println("Divisi : " + Karyawan002.divisi);
                
        
    }
}
