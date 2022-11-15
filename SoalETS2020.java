/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author KomangRyan
 */
public class SoalETS2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persegi A = new Persegi("Merah",8);
       A.info();
    }
    
}

class Bentuk{
    String Warna;
    public Bentuk(String x) {
        System.out.println("Konstruktor Bentuk dipanggil");
        Warna = "x";
        
    }
}

class Persegi extends Bentuk {
    private int sisi;
    
    public Persegi(String A, int B){
       super(A);
        System.out.println("Konstruktor Persegi dipanggil");
        sisi = B;
    }
public void info(){
    System.out.println("Warna persegi adalah : "+ Warna);
    System.out.println("Ukuran adalah : "+ sisi);
}
}
