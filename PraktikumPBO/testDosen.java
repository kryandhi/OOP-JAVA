/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author KomangRyan
 */
public class testDosen {
    public static void main(String[] args) {
        rektor rek = new rektor("Andi","123456789","Informatika",2006,2);
        dekan dek = new dekan("Ahmad","132456789","Geomatika","2008");
        kalab lab = new kalab("Indah","143257589","Informatika","K5C");
        
        rek.view();
        rek.viewRektor();
        
        dek.view();
        dek.viewDekan();
        
        lab.view();
        lab.viewKalab();
    }
}
