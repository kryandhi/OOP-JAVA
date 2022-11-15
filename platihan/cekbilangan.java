/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package platihan;

/**
 *
 * @author KomangRyan
 */
import java.util.Scanner;
public class cekbilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
     
        System.out.println("masukkan bil =");
        int bil =input.nextInt();
        
     
        
             
             cMyDeteksi p = new cMyDeteksi();
            // p.deteksi2(b);
            System.out.println(p.deteksi2(bil));
    }
    
}

