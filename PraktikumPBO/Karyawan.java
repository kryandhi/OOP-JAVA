/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author KomangRyan
 */
public class Karyawan {
   public String ID,nama,divisi;
   public double gaji;
   
   void setNama(String nm){
           nama = nm;
   }
    String getNama(){
           return this.nama ;
    }
    void setID(String IDcard){
       ID = IDcard;
   }
   String getID(){
       return ID ;
   }
   
  
   void setDivisi(String dv){
           divisi = dv;
   }
   String getDivisi(){
           return divisi ;
   }
   void setGaji(double gj){
           gaji = gj;
   }
   Double getGaji(){
       return  gaji;
   }
   void cetakData(){
       System.out.println("Data Karyawan : ");
       System.out.println("ID :" + ID);
       System.out.println("Nama : " + nama);
       System.out.println("Divisi :" + divisi);
       System.out.println("Gaji :" + gaji);
   }
   
   double hitungSumbanganZakat(){
       double zakat = gaji * 0.025;
       return zakat;
   }
}
