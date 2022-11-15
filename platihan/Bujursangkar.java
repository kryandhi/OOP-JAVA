/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platihan;

/**
 *
 * @author KomangRyan
 */
public class Bujursangkar {
  
    public static void main(String[] args) {
        persegipanjang a = new persegipanjang();
       
        System.out.println(a.isBujursangkar());
        System.out.println(a.getLuas());

        balok b = new balok();
        System.out.println(b.getLuas());
        
        

    }

}

class persegipanjang{
    private int panjang;
    private int lebar;

    public void setPanjang(int pjg) {
        panjang = pjg;
    }
    public int getPanjang(){
        return panjang;
    }
    public void setLebar(int lbr){
        lebar = lbr;
    }
    public int getLebar(){
        return lebar;
    }
    public int getLuas(){
        return panjang*lebar;
    }
    public boolean isBujursangkar(){
    if(this.panjang == this.lebar)
    return true;
    else
    return false;

}

}
class balok extends persegipanjang{
    private int tinggi;

    public void setTinggi(int t) {
        tinggi = t;
    }
    public int getTinggi(){
        return tinggi;
    }
    public int getLuas(){
        return 2*(super.getLuas()+super.getPanjang()*tinggi+super.getLebar()*tinggi);
    }
    public int getVolume(){
        return (super.getLuas()*tinggi);
    }
} 

