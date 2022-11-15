/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platihan;

// int x = 0 inisialisasi
// int x deklarasi


/**
 *
 * @author KomangRyan
 */
public class cPecahan {
    private int pembilang,penyebut;
    

public cPecahan(){
this.pembilang = 0;
this.penyebut = 1;

}
public cPecahan(int p1, int p2){
this.pembilang = p1;
this.penyebut = p2;
}

public void ingfo(){
    System.out.println("Pecahan : " + this.pembilang + "/" + this.penyebut);;
}

public void kaliC1(int x ) {
    this.pembilang = this.pembilang*x;
    this.penyebut = this.penyebut;
}
public cPecahan kaliC(int c){
    cPecahan k1 = new cPecahan();
    k1.pembilang = this.pembilang*c;
    k1.penyebut = this.penyebut;
    
    return k1;
}


public void setPecahan(cPecahan p){
    this.pembilang = p.pembilang;
    this.penyebut = p.penyebut;
    
    
}

public double konversi(cPecahan x ){
    double hasil;
    hasil = (double)x.pembilang/(double)x.penyebut;
    return hasil;
    
}

public cPecahan jumlah(cPecahan x){
 cPecahan k1 = new cPecahan();
 
 k1.pembilang = this.pembilang*x.penyebut + x.pembilang*this.penyebut;
 k1.penyebut = this.penyebut*x.penyebut;
 
 return k1;
}

public void konversi(){
    double hasil;
     hasil = (double)this.pembilang/(double)this.penyebut;
     System.out.println("this.pembilang/this.penyebut");
}
    public static void main(String[] args) {
     //   cPecahan test;
     //   cPecahan p = new cPecahan(1,2);
      //  test = p.kaliC(10);
      //  p.setPecahan(cPecahan k2 = new cPecahan());
        //p.ingfo();
        System.out.println("");
        
        cPecahan p = new cPecahan(2,5);
        cPecahan p1 = new cPecahan(3,4);
        
        cPecahan hasil;
        hasil = p1.jumlah(p1);
        hasil.ingfo();
        
        
        
        double desimal;
        desimal = hasil.konversi(hasil);
        System.out.println("hasil konversi : " + desimal);
        
        desimal = p.konversi(p);
        p.ingfo();
        System.out.println("hasil konversi : " + desimal);
        
        
        p.kaliC(100);
        p.ingfo();
        
     //   cPecahan hasil;
        
        hasil = p.kaliC(10);
        hasil.ingfo();
        p.ingfo();
        
        cPecahan pBaru = new cPecahan(100,2);
        p.setPecahan(pBaru);
        p.ingfo();
       
    }
    }


