/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platihan;

/**
 *
 * @author KomangRyan
 */
public class cKendaraan {
    private String warna;
    private String bbm;
    private int jmlRoda;
    
    public cKendaraan (){
        this.warna = "default";
        this.bbm = "default";
        this.jmlRoda = 0;
    }
    
    public cKendaraan (String wn,String bb){
        this.warna = wn;
        this.bbm = bb;
    }
    
    public void setWarna(String wn){
        this.warna = wn;
        
    }
    public void setBBM(String bb){
     this.bbm = bb;   
    }
    
    public void setJmlRoda(int jr){
     this.jmlRoda = jr;   
    }
    
    public String getWarna(){
        
        return this.warna;
    }
    
    public String getBbm(){
        
        return this.bbm;
    }
    public int getJmlRoda(){
        
        return this.jmlRoda;
   
    }
    public void info(){
           System.out.println("Warna : " + getWarna());
           System.out.println("BBM : " + getBbm ());
           System.out.println("jmlRoda : " + getJmlRoda());
    }
}
    
    class cBus extends cKendaraan{     //cbus anaknya dari ckendaraan
        private int jmlPenumpang;
        private String trayek;
        
        
        public cBus(){
            this.jmlPenumpang = 60;
            this.trayek = "ADP";
  
        }
        public void setjmlPenumpang(int jp){
                this.jmlPenumpang = jp;
    }
       public void setTrayek(String t){
                this.trayek = t;
    }
       public int getjmlPenumpang(){
           return this.jmlPenumpang;
       }
       public String getTrayek(){
           return this.trayek;
       }
       public void info(){
           super.info();
           System.out.println("Jml Penumpang : " + getjmlPenumpang());
           System.out.println("Trayek : " + getTrayek());
       }

    
}