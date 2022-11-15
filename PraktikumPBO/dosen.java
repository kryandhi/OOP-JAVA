/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author KomangRyan
 */
public class dosen {
    
    protected String nama;
    protected String nik;
    protected String jurusan;
    
  dosen(String namaX, String nikX,String jurusanX){
        this.nama = namaX;
        this.jurusan = jurusanX;
        this.nik = nikX;
    }
    
    public void view(){
        System.out.println("Nama : " + nama);
        System.out.println("NIK : " + nik);
        System.out.println("Jurusan " + jurusan);
    }
}

class rektor extends dosen{
    private int th_mulai;
    private int jabatan_ke;
    
    rektor (String namaX, String nikX, String jurX, int thX, int keX){
        super (namaX, nikX, jurX);
        th_mulai = thX;
        jabatan_ke = keX;
    }
    
    public void viewRektor(){
        System.out.println("Th mulai jabatan : " + th_mulai);
        System.out.println("Jabatan rektor ke- " + jabatan_ke);
    }
}

class dekan extends dosen {
    private String fakultas;
    
    dekan(String namaX, String nikX, String jurX, String fakX){
        
        super(namaX, nikX, jurX);
        fakultas = fakX;
      
    }  
      public void viewDekan(){
          System.out.println("Fakultas : "+ fakultas);
      }
    }

class kalab extends dosen{
    private String laboratorium;
    
kalab(String namaX, String nikX, String jurX, String labX){
    super(namaX, nikX, jurX);
    laboratorium = labX;
}

void viewKalab(){
    System.out.println("Laboratorium : "+ laboratorium);
    
}

}