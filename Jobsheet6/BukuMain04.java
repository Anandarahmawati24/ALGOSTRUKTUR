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
        int kodeBuku = s.nextInt();
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
    System.out.println("Masukkan kode buku yang dicari: ");
    System.out.print("Kode buku : ");
    int cari = s.nextInt();
    System.out.println("menggunakan sequential search ");
    int posisi = data.FindSeqSearch(cari);
    data.Tampilposisi(cari, posisi);
    data.TampilData(cari, posisi);
}
}