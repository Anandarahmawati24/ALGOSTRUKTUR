package Jobsheet2;

public class BukuMain04 {
    public static void main(String[] args) {
        Buku04 bk1 = new Buku04();
        bk1.Judul = " Today Ends Tomorrow Comes";
        bk1.Pengarang = "Denada Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 5;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku04 bk2 = new Buku04("Self Reward", "Mahendra Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku04 bukuAnanda = new Buku04("Teori Algoritma dan Struktur Data", "Albert Einstein", 250, 10, 50000);
        bukuAnanda.terjual(9);
        bukuAnanda.tampilInformasi();

    }
}