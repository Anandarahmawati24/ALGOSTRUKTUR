package Kuis1;

public class Pegawai {
    String nama;
    int masaKerjaThn;
    double jamLembur;
    int gajiPokok;


public Pegawai (String nm, int masker, double Jl, int Gp) {
nama = nm;
masaKerjaThn = masker;
jamLembur = Jl;
gajiPokok = Gp;
}

public double hitungGajiLembur(){
    double GajiLemburperjam; 
    if(masaKerjaThn < 5 ){
        GajiLemburperjam = 0.5 *gajiPokok;
    } else {
        GajiLemburperjam = 0.10 *gajiPokok;
    }
    return jamLembur*GajiLemburperjam;
}

public double hitungTunjangan(){
double Tunjangan;
if (masaKerjaThn < 5){
    Tunjangan = 0.25 *gajiPokok;
} else {
    Tunjangan = 0.50*gajiPokok;
}
 return Tunjangan;
}

public double hitungGajiTotal(){
return gajiPokok+ hitungGajiLembur()+ hitungTunjangan();
}

void printData(){
System.out.println("Nama Pegawai: " +nama);
System.out.println("Masa kerja: "+masaKerjaThn +" tahun");
System.out.println("Jumlah jam Lembur: "+jamLembur +" jam");
System.out.println("Gaji pokok: " +gajiPokok);
System.out.println("Gaji Total: " +hitungGajiTotal());
}

}