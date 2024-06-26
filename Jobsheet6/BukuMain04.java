import java.util.Scanner;
public class BukuMain04 {
    public static void main(String[] args) {   
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);

    PencarianBuku04 data = new PencarianBuku04();
    int jumBuku = 5;

    System.out.println("-------------------------------------");
    System.out.println("Masukkan data Buku secara urut dari kode buku terkecil : ");
    for (int i = 0; i < jumBuku; i++){
        System.out.println("-----------------");
        System.out.print("Kode Buku \t : ");
        String kodeBuku = s1.nextLine();
        System.out.print("Judul Buku \t : ");
        String judulBuku = s1.nextLine();
        System.out.print("Tahun terbit \t : ");
        int TahunTerbit = s.nextInt();
        System.out.print("Pengarang \t : ");
        String pengarang = s1.nextLine();
        System.out.print("Stock \t\t : ");
        int stok = s.nextInt();
     
        Buku04 m = new Buku04(kodeBuku, judulBuku, TahunTerbit, pengarang, stok);
        data.tambah(m);
    }

    System.out.println("---------------------------------------");
        System.out.println("Data keseluruhan buku : ");
        data.tampil();

        System.out.println("________________________________________");
        System.out.println("________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan judul buku yang dicari: ");
        System.out.print("Judul buku : ");
        String cari = s1.nextLine();
        System.out.println("================================");
        System.out.println("menggunakan sequential search ");
        int posisi = data.FindSeqSearchJudBuk(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("================================");
        System.out.println("menggunakan metode Find Buku ");
        Buku04 dataBuku04 = data.FindBuku(cari);
        if (dataBuku04 != null) {
            dataBuku04.tampilDataBuku();
        } else {
            System.out.println("Buku tidak ditemukan.");
        }

        System.out.println("================================");
        System.out.println("menggunakan binary search");
        posisi = data.FindBinarySearchJudBuk(cari);
        data.cariJudulBuku(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
}
}