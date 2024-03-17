package Jobsheet4;

public class Showroom {
    public String merk, tipe, tahun;
    int topAcceleration;
    int  topPower;
    Showroom sr[] = new Showroom[8];

    public Showroom (String mrk, String typ, String thn, int tA, int tP){
        this.merk = mrk;
        this.tipe = typ;
        this.tahun = thn;
        this.topAcceleration = tA;
        this.topPower = tP;
    } 
}
