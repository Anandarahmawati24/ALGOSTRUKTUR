package Jobsheet5;

public class Hotel {
    String nama, kota;
    int harga;
    byte rate;

    Hotel(String n, String k, int h, byte r){
        this.nama=n;
        this.kota=k;
        this.harga=h;
        this.rate=r;
    }

    void tampil(){
        System.out.println("Nama Hotel: " +nama);
        System.out.println("Kota: " + kota);
        System.out.println("Harga: " + harga);
        System.out.println("Rating: " + rate);
    }
}