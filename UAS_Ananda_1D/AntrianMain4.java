package UAS_Ananda_1D;
import java.util.Scanner;

public class AntrianMain4 {
    static Scanner scanner = new Scanner(System.in);
    static Kendaraan4[] kendaraanArray = new Kendaraan4[4];// menginstansiasi banyak kendaraan dalam array adalah 4
    static TransaksiPajak4[] transaksiArray = new TransaksiPajak4[10]; // menginstansiasi panjang array menjadi 10
    static int HitTransaksi = 0; // menginstansiasi jumlah HitungTransaksi awal adalah 0;

    public static void main(String[] args) {
        // Mengisi data kendaraan sesuai dengan soal
        kendaraanArray[0] = new Kendaraan4("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4);
        kendaraanArray[1] = new Kendaraan4("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3);
        kendaraanArray[2] = new Kendaraan4("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2);
        kendaraanArray[3] = new Kendaraan4("B 1234 AG", "Sisa", "Motor", 150, 2020, 1);

        int pilihan;
        do { // menampilkan data menu
            System.out.println("\nMenu:");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi Berdasarkan Nama Pemilik");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {//menggunakan perulangan switch case untuk bagian pilihan menu pengguna, program akan berhenti apabila pilihan tidak sama dengan 5
                case 1:
                    daftarKendaraan();// memanggil method daftar kendaraan
                    break;
                case 2:
                    bayarPajak();// memanggil method bayar pajak dengan memasukkan nomor TNKB dan jumlah bulan bayar sesuai dengan soal
                    break;
                case 3:
                    tampilkanTransaksi();// menampilkan data transaksi yang telah dilakukan oleh pengguna dan terrecord oleh program 
                    break;
                case 4:
                    urutkanTransaksi();// memanggil method untuk mengurutkan transaksi
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }

    static void daftarKendaraan() { // method yang digunakan untuk menampilkan daftar kendaraan yang telah diimputkan oleh pengguna
        System.out.println("-------------------");
        System.out.println("Daftar Kendaraan ");
        System.out.println("--------------------");
        for (Kendaraan4 k : kendaraanArray) { // mengambil nilai dari array kendaraan kemudian melakukan perulangan selama objek k masih belum null maka program akan terus berjalan
            if (k != null) {
                System.out.println(k); //  menampilkan objek kendaraan
            }
        }
    }

    static void bayarPajak() { // method bayar bajak dengan menggunakan nomor TNKB dan bulan bayar 
        System.out.println("\nMasukkan Data Pembayaran");
        System.out.print("Masukkan Nomor TNKB: ");
        String noTNKB = scanner.nextLine();
        System.out.print("Bulan Bayar: ");
        int bulanBayar = scanner.nextInt();
        scanner.nextLine();

        Kendaraan4 kendaraan = null;
        for (Kendaraan4 k : kendaraanArray) {
            if (k != null && k.noTNKB.equals(noTNKB)) { // mencocokan data TNKB yang akan dibayar oleh pengguna selama kendaraan tidak sama dengan null 
                kendaraan = k;
                break;
            }
        }

        if (kendaraan == null) { // jika kendaraan sama dengan null maka program akan menampilkan pesan kendaraan tidak ditemukan
            System.out.println("Kendaraan tidak ditemukan.");
            return;
        }

        long nominalBayar = hitungNominalBayar(kendaraan);
        long denda = hitungDenda(kendaraan, bulanBayar);

        TransaksiPajak4 transaksi = new TransaksiPajak4(bulanBayar, bulanBayar, nominalBayar, denda, kendaraan); // menggunakan classs TransaksiPajak
        transaksiArray[HitTransaksi++] = transaksi;

        System.out.println("\nDetail Pembayaran:");
        System.out.println(transaksi);
    }

    static long hitungNominalBayar(Kendaraan4 kendaraan) { // method untuk menghitung jumlah nominal yang harus dibayar berdasarkan jenis dan jumlah cc nya
        if (kendaraan.jenis.equalsIgnoreCase("motor")) {
            if (kendaraan.cc < 100) {
                return 100000;
            } else if (kendaraan.cc <= 250) {
                return 250000;
            } else {
                return 500000;
            }
        } else if (kendaraan.jenis.equalsIgnoreCase("mobil")) {
            if (kendaraan.cc < 1000) {
                return 750000;
            } else if (kendaraan.cc <= 2500) {
                return 1000000;
            } else {
                return 1500000;
            }
        }
        return 0;
    }

    static long hitungDenda(Kendaraan4 kendaraan, int bulanBayar) { // method untuk menghitung denda kendaraan apabila telat membayar sesuai dengan soal
        int selisihBulan = bulanBayar - kendaraan.bulanHarusBayar;
        if (selisihBulan > 0 && selisihBulan <= 3) {
            return 50000;
        } else if (selisihBulan > 3) {
            return 50000 * selisihBulan;
        }
        return 0;
    }

    static void tampilkanTransaksi() { //menampilkan seluruh data record transaksi yang telah di lakukan oleh pengguna
        System.out.println("\nSeluruh Transaksi:");
        long totalPendapatan = 0;
        for (int i = 0; i < HitTransaksi; i++) {
            System.out.println(transaksiArray[i]);
            totalPendapatan += transaksiArray[i].nominalBayar + transaksiArray[i].denda;
        }
        System.out.println("Total Pendapatan: " + totalPendapatan);
    }

    static void urutkanTransaksi() { // menggunakan algoritma bubble short untuk mengurutka data secara ascending berdasarkan nama pemilik
        int n = HitTransaksi;
        TransaksiPajak4 temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                TransaksiPajak4 transaksi1 = transaksiArray[j];
                TransaksiPajak4 transaksi2 = transaksiArray[j + 1];

                if (transaksi1 != null && transaksi2 != null &&
                    transaksi1.Kendaraan.nama.compareTo(transaksi2.Kendaraan.nama) > 0) {
                    // melakukan swap dari transaksi 1 ke transaksi 2
                    temp = transaksi1;
                    transaksiArray[j] = transaksi2;
                    transaksiArray[j + 1] = temp;
                }
            }
        }
        tampilkanTransaksi(); // menampilkan seluruh transaksi setelah diurutkan
    }
}
