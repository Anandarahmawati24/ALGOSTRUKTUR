package Jobsheet3;

public class limas {
    
    int panjangSisiAlas, tinggi;

    double hitungVolume() {
        double volume = (1.0d/3.0d) * panjangSisiAlas * panjangSisiAlas * tinggi;
        return volume;
    }

    
double hitungLuasPermukaan() {
    double luasPermukaan = (panjangSisiAlas * panjangSisiAlas) + (4 * (1.0d/2.0d) * panjangSisiAlas * tinggi);
        return luasPermukaan;
}
}