/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO;

/**
 *
 * @author KomangRyan
 */
import java.util.Scanner;
public class ContohEksepsi1 {
    public static void main(String[] args) {
       
        int[] a = {0,1,2,3,4,5};
        Scanner userInput = new Scanner(System.in);
        System.out.println(" nilai array ke :" );
        int index = userInput.nextInt();
        // exception handling
//        try{
//        System.out.printf("index ke-%d, adalah %d", index,a[index] );
//        }catch(Exception e){
//            System.out.println(e);
//            
//        }finally{
//            System.out.println("\nini adalah final");
//        }     

           //method exception throws
//           int dt = 0;
//           try{
//               d = aData(a,index);
//           }catch(Exception e){
//               System.err.println("e");
//           } 
//           
//        int data = ambilData(a,index);
//        System.out.printf("Inext ke-&d, adalah %d",index,data);
//        System.out.println("ini adalah akhir program");
        
        public static int aData(int[] b, int j)throws Exception{
            int hasil = b[j];
        return hasil;
        }
        // salah karena tidak terdapat indeks ke 7
        
    }
     
    public static int ambilData(int[] a, int i){
        int hasil = 0;
        
       try{
           hasil = a[i];
        throw new Exception();
       }catch(Exception e){
           System.err.println("Index tidak terdeteksi");
       } 
        return hasil;
    }

