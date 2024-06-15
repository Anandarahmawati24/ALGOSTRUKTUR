package UAS_Ananda_1D;

public class TransaksiPajak4 {
    int kode, bulanBayar;
    long nominalBayar, denda;
    Kendaraan4 Kendaraan;

    TransaksiPajak4( int kode, int bulanBayar, long nominalBayar, long denda, Kendaraan4 Kendaraan){
        this.kode=kode;
        this.bulanBayar=bulanBayar;
        this.nominalBayar=nominalBayar;
        this.denda=denda;
        this.Kendaraan=Kendaraan;
    }
    public String toString() {
        return "Kode: " + kode + ", TNKB: " + Kendaraan.noTNKB + ", Nama: " + Kendaraan.nama + 
               ", Nominal: " + nominalBayar + ", Denda: " + denda + ", Bulan Bayar: " + bulanBayar;
    }
}