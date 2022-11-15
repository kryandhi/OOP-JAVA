/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platihan;

/**
 *
 * @author KomangRyan
 */
public class cBentuk {
    private String warna;
    
    public cBentuk(){
        this.warna = "default";
        
    }
     public cBentuk(String wn){
        this.warna = wn;
        
    }
    
    public String getWarna(){
        return this.warna;
    }
    
    public void setWarna(String wn){
        
         this.warna = wn;
    }    
    public void info(){
        System.out.println("Bentuk berwarna : "+ getWarna ());
    }
}


class cLingkaran extends cBentuk{
    private double radius;  //  deklarasi = tidak ada sama dengan
                            // inisiasi = ada sama dengan
    
    public cLingkaran(){
        super();
        this.radius = 0;
    }
    public cLingkaran(String wn,double r){
        super(wn);
        this.radius = r;
        
    }
    public void setRadius(double r){            //Method setRadius membawa parameter r yang bertipe double dan method ini tidak mengembalikan nilai
        
         this.radius = r;          // meng inisiasi radius menjadi r  
                 }    
    
     public double getRadius(){         // Method getRadius mengembalikan radius dan bertipe double
        return this.radius;
        
    }
      public double hitungLuasLing(){
          return radius*radius*Math.PI;
      }
      
     
    public void info(){
        super.info();   //mengambil method info dari class parent cbentuk
        System.out.println("Luas lingkaran : "+ hitungLuasLing());
    }
}

class cSilinder extends cLingkaran{
    private double tinggi;
    
    public cSilinder (){
        this.tinggi = 0;
    }
    public cSilinder(double t, double r, String wn){
        super.setWarna(wn);
        super.setRadius(r);
       this.tinggi = t;    
    }
    public void setTinggi(double t){
       this.tinggi = t;
    }
    public double getTinggi(){
       return this.tinggi;
    }
    public double hitungVolume(){
        
        return super.hitungLuasLing()*tinggi;
        
    }
    
    public void info(){
        System.out.println("Silinder Berwarna : " + super.getWarna());
        System.out.println("Volume Silinder : " + hitungVolume());
    }
}
    
class cBujursangkar extends cBentuk{
    private double sisi;
    
    public cBujursangkar(){
        this.sisi = 0;
}
  
    public cBujursangkar(String wn,double ss){
        super(wn);
        this.sisi = ss;
    }
    public void setSisi(double ss){
        this.sisi = ss;
    }
    public double getSisi(){
        return sisi;
    }
    public double hitungLuas(){
        return sisi*sisi;
    }
    public void info(){
        super.info();
        System.out.println("Bujur sangkar berwarna : "+ super.getWarna());
        System.out.println("Luas bujur sangkar : "+ hitungLuas());
        
    }
}
