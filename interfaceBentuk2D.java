/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author KomangRyan
 */
public interface interfaceBentuk2D {
    
        public String warna();
        public double area();
        
        
}

class persegi implements interfaceBentuk2D{
    private double p,l;
    private String warna;
    
    public persegi(){
        this.p = 0;
        this.l = 0;
        this.warna = "tidak berwarna"; 
    }
    public void setWarna(String w){
        this.warna = w;
    }
    public String warna(){
        return this.warna
                ;
    }
    public void setPanjang(double p){
        this.p = p;
    }
    public void setLebar(double l){
        this.l = l;
    }
    public double area(){
        return (this.p*this.l);
    }
}

class lingkaran implements interfaceBentuk2D{
    private double r;
    public String w1,w2;
    
    public lingkaran(){
        this.w1="hitam";
        this.w2="putih";
    }
    
    public String warna(){
        return this.w1 +"-"+ this.w2;
    }
    public double area(){
        return Math.PI*this.r*this.r;
        
    }
}
