/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author KomangRyan
 */
public class Manager {
        private int alowance;
        
        public Manager(String no, String name, int sallary, int allowance){
           
            this.alowance = allowance;
        }
        
        public void printDetails(){
            System.out.println("allowance :" + this.alowance);
            
        }
}
