/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package platihan;

/**
 *
 * @author KomangRyan
 */
public class testcBentuk {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       cBentuk k = new cBentuk("merah");
       cSilinder  k1 = new cSilinder (10.0,2.0,"ungu");
       cBujursangkar k2 = new cBujursangkar("biru",2.0);
       cLingkaran k3 = new cLingkaran ("merah",3.0);
        
       
        
      k.info();
        System.out.println("===========");
      k1.info();
        System.out.println("===========");
      k2.info();
        System.out.println("===========");
      k3.info();
    // overload = parameter / tipe data berbeda
    // overide = parameter sama
    }
    
}
