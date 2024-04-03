package Jobsheet7;
import java.util.Scanner;
public class Utama04 {
    public static void main(String[] args) {
        Gudang04 gudang = new Gudang04(7);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                System.out.print("Masukkan kode barang: ");
                int kode = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Masukkan nama barang: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan nama kategori: ");
                String kategori = scanner.nextLine();
                Barang04 barangBaru = new Barang04(kode, nama, kategori);
                gudang.tambahBarang(barangBaru);
                break;
                case 2:
                gudang.ambilBarang();
                break;
                case 3:
                gudang.tampilBarang();
                break;
                case 4:
                System.out.println("Terima kasih");
                return;
                default:
                System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
        }
    }
}
}
