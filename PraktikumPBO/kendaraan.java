/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author KomangRyan
 */
public class kendaraan {
    private String model;
    
    //Inialisasi
    public kendaraan(String model){
        this.model = model;
    }
    
    
    //Informasi yang merupakan method tanpa instruksi
    public void informasi(){
    }
    
}
class pesawat extends kendaraan{
    private String nama;
    private String jenis;
    
    public pesawat(String nama){
        super("Pesawat");
        this.nama = nama ;
        jenis = "belum teridentifikasi";
    }
    
    public pesawat(String nama, String jenis){
        super("Pesawat");
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void informasi(){
        System.out.println("Nama pesawat adalah " + nama);
        System.out.println("Jenis pesawat adalah " + jenis);
    }
}

    class mobil extends kendaraan {
        private String nama;
        private String jenis;
        
        public mobil(String nama){
            super("Mobil");
            this.nama = nama;
            jenis = "belum teridentifikasi";
        }
        
        public mobil(String nama, String jenis){
            super("Mobil");
            this.nama = nama;
            this.jenis = jenis;
        }
        
      public  void informasi(){
            System.out.println("Nama mobil adalah "+nama);
            System.out.println("Jenis mobil adalah "+jenis);
            
        }
    }
      
    class kapal extends kendaraan{
    private String nama;
    private String jenis;
    
    public kapal(String nama){
        super("Kapal");
        this.nama = nama;
        jenis = "belum teridentifikasi";
    }
    
    public kapal(String nama, String jenis){
        super("Kapal");
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void informasi(){
        System.out.println("Nama kapal adalah " + nama);
        System.out.println("Jenis kapal adalah " + jenis);
    }
}
     


       
    

class Main {
    
    public static void main(String[] args){
        kendaraan P;
        pesawat psw = new pesawat("Boeing 787","Pesawat komersial");
        mobil mbl1 = new mobil("Toyota Kijang","Jeep");
        mobil mbl2 = new mobil("Suzuki Baleno","Sedan");
        mobil mbl3 = new mobil("VW Combi");
        kapal kpl = new kapal("Queen Sary Z","Kapal Pesiar");
        
        P = psw;
        P.informasi();
        P = mbl1;
        P.informasi();
        P = mbl2;
        P.informasi();
        P = mbl3;
        P.informasi();
        P = kpl;
        P.informasi();
    }
}









