/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package platihan;

/**
 *
 * @author KomangRyan
 */
public class rendy {
    public static void main(String[] args) {
        datapenyewa data = new datapenyewa();
        data.setNama("Rendy");
        data.setAlamat("Bogor");

        mobil mobil = new mobil();
        mobil.setMerek("Ferrari");
        mobil.setJenis("Sport");

        penyewaan sewa = new penyewaan();
        sewa.lihatDataPenyewa();
    }
}

class penyewaan{
    public datapenyewa anggota;
    public mobil mobilDisewa;

    public void lihatDataPenyewa(){
        System.out.println("Nama :" + anggota.getNama());
        System.out.println("Alamat :" + anggota.getAlamat());
        System.out.println("Jenis :" + mobilDisewa.getJenis());
        System.out.println("Merek :" + mobilDisewa.getMerek());
    }
}

class datapenyewa extends penyewaan{
    public String Nama;
    public String Alamat;

    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public String getNama(){
        return Nama;
    }
    public String getAlamat(){
        return Alamat;
    }
}

class mobil extends penyewaan{
    public String Jenis;
    public String Merek;
    
    public String getJenis(){
        return Jenis;
    }
    public String getMerek(){
        return Merek;
    }
    public void setJenis(String Jenis){
        this.Jenis = Jenis;
    }
    public void setMerek(String Merek){
        this.Merek = Merek;
    }
}