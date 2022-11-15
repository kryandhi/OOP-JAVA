/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pAbstrak;

/**
 *
 * @author KomangRyan
 */
public class testAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       cLingkaran p = new cLingkaran();
      p.setWarna("hitam");
      p.setJari(10);
      
        System.out.println(" luas lingkaran : "+p.hitungLuas());
      
        cPersegiPanjang pp = new cPersegiPanjang();
        pp.setUkuran(10, 5);
        System.out.println(" luas persegipanjang : "+pp.hitungLuas());
    }
    
}
