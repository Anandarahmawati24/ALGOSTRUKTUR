package Jobsheet2;

public class BukuMain04 {
    public static void main(String[] args) {
        Buku04 bk1 = new Buku04();
        bk1.Judul = " Today Ends Tomorrow Comes";
        bk1.Pengarang = "Denada Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

    }
}