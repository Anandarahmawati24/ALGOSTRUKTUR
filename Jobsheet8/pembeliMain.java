package Jobsheet8;
import java.util.Scanner;
public class pembeliMain{
    public static void menu() {
            System.out.println("\nPilih Menu:");
            System.out.println("1. Tambah Pembeli");
            System.out.println("2. Hapus Pembeli");
            System.out.println("3. Lihat Pembeli Paling Depan");
            System.out.println("4. Lihat Pembeli Paling Belakang");
            System.out.println("5. Cari Posisi Pembeli");
            System.out.println("6. Lihat Semua Pembeli");
            System.out.println("7. Keluar");
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        int max = jumlah;
        queuePembeli antri = new queuePembeli(jumlah);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama Pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan No HP Pembeli: ");
                    int noHP = sc.nextInt();
                    sc.nextLine();
                    pembeli pembeliBaru = new pembeli(nama, noHP);
                    antri.Enqueue(pembeliBaru);
                    break;
                case 2:
                pembeli pembeliHapus = antri.Dequeue();
                if (pembeliHapus != null) {
                    System.out.println("Pembeli " + pembeliHapus.nama + " dengan nomor HP " +
                            pembeliHapus.noHP + " telah dihapus dari antrian.");
                }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekrear();
                    break;
                case 5:
                System.out.print("Masukkan nama pembeli yang ingin dicari: ");
                    String namaCari = sc.nextLine();
                    antri.peekPosition(namaCari);
                    break;
                case 6:
                    System.out.println("Daftar Pembeli:");
                    antri.daftarPembeli();
                    break;
                case 7:
                    System.out.println("Terima kasih telah menggunakan program antrian.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            } 
        }   while (pilih != 7);
    }
}