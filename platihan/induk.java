/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platihan;

/**
 *
 * @author KomangRyan
 */
public class induk {
    public void metode1(int x){
        System.out.println("induk 1");          // overide method sama jenis parameter sama
                                                // tapi harus berbeda kelas, contohnya di kelas induk dan di kelas anak
    }
    public void metode1(int x, int y){
        System.out.println("induk 1 - 2");
        
    }
    
    public void metode1(String x,int y){
        System.out.println("induk 1 - 2 overload");
    }
}
  class anak extends induk {
      
      @Override
      public void metode1(int x){
          System.out.println("ini dari anak1 "+ x);
          
      }
      public void metode1(int x, String y, int z){
        super.metode1(x, z);
          System.out.println("ini anak 3 parameter");
        
    
      
  }
    
}
 class testInduk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        anak a = new anak();
        a.metode1(100);
        a.metode1(100, "cakep", 888);
        a.metode1("budi", 100);
       
    }
 }
