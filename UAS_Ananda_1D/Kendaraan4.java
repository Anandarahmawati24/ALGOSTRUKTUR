package UAS_Ananda_1D;

public class Kendaraan4 {
    String noTNKB, nama, jenis;
    int cc,tahun,bulanHarusBayar;

    Kendaraan4 (String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        this.noTNKB= noTNKB;
        this.nama=nama;
        this.jenis=jenis;
        this.tahun=tahun;
        this.cc=cc;
        this.bulanHarusBayar=bulanHarusBayar;
    }

    public String toString() {
        return noTNKB + " |" + nama + " | " + jenis + " | " + cc + "cc | " + tahun + " | Bulan Harus Bayar: " + bulanHarusBayar;
    }
}