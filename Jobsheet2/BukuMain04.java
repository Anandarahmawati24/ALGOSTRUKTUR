package Jobsheet2;
public class BukuMain04 {
    public static void main(String[] args) {
        Buku04 bk1 = new Buku04();
        bk1.Judul = " Today Ends Tomorrow Comes";
        bk1.Pengarang = "Denada Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 10;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(7);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        System.out.println("Harga yang harus dibayar "+bk1.hitungHargaBayar(7));
        System.out.println("Harga yang terjual "+bk1.HitungHargaTotal(7));
        System.out.println("Diskon "+bk1.hitungDiskon(7));
        

        Buku04 bk2 = new Buku04("Self Reward", "Mahendra Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        System.out.println("Harga yang harus dibayar "+bk2.hitungHargaBayar(11));
        System.out.println("Harga yang terjual "+bk2.HitungHargaTotal(11));
        System.out.println("Diskon "+bk2.hitungDiskon(11));

        Buku04 bukuAnanda = new Buku04("Teori Algoritma dan Struktur Data", "Albert Einstein", 250, 10, 50000);
        bukuAnanda.terjual(9);
        bukuAnanda.tampilInformasi();


       int hargaAkhir = bukuAnanda.HitungHargaTotal(9);
       int hargabayar = bukuAnanda.hitungHargaBayar(9);
       System.out.println("harga yang harus di bayar " + hargabayar);
        System.out.println("Harga yang terjual "+ hargaAkhir);
        System.out.println("Diskon "+bukuAnanda.hitungDiskon(9));
    }
}