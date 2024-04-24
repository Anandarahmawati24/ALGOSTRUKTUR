package UTS.UTS;
import java.util.Scanner;
public class perbankanMain04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        //mengatur panjang dari array
        System.out.print("Masukkan jumlah rekening: ");
        int size = sc04.nextInt();
        sc04.nextLine();
        Sistemperbankan04 bank = new Sistemperbankan04(size);
        // menampilkan menu program
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. input data Rekening");
            System.out.println("2. Tampil semua data Rekening");
            System.out.println("3. Data Rekening berdasarkan saldo dalam mode menurun");
            System.out.println("4. Tampil data Rekening yang memiliki saldo < 50000");
            System.out.println("5. Cari data Rekening berdasarkan kata kunci nama");
            System.out.println("6. Tarik uang dari Rekening");
            System.out.println("7. Setor uang ke Rekening");
            System.out.println("8. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = sc04.nextInt();
            sc04.nextLine(); 
            // kode untuk memilih menu program
            switch (opsi) {
                case 1:
                    System.out.print("Masukkan nomor rekening: ");
                    int nomorRekening = sc04.nextInt();
                    sc04.nextLine(); 
                    System.out.print("Masukkan nama: ");
                    String nama = sc04.nextLine();
                    System.out.print("Masukkan nomor telepon: ");
                    String nomorTelepon = sc04.nextLine();
                    System.out.print("Masukkan email: ");
                    String email = sc04.nextLine();
                    System.out.print("Masukkan saldo: ");
                    double saldo = sc04.nextDouble();
                    bank.tambahRekening(nomorRekening, nama, nomorTelepon, email, saldo);
                    break;
                case 2:
                    bank.tampilSemuaRekening();
                    break;
                case 3:
                    bank.BubbleShortRekMenurun();
                    break;
                case 4:
                    bank.tampilRekeningunder50000();
                    break;
                case 5:
                    System.out.print("Masukkan kata kunci nama yang akan dicari: ");
                    String kataKunci = sc04.nextLine();
                    bank.cariRekeningBerdasarkanNama(kataKunci);
                    break;
                case 6:
                    System.out.print("Masukkan nomor rekening: ");
                    int nomorRekeningTarik = sc04.nextInt();
                    System.out.print("Masukkan jumlah yang akan ditarik: ");
                    double jumlahTarik = sc04.nextDouble();
                    bank.tarikSaldoDariRekening(nomorRekeningTarik, jumlahTarik);
                    break;
                case 7:
                    System.out.print("Masukkan nomor rekening: ");
                    int nomorRekeningSetor = sc04.nextInt();
                    System.out.print("Masukkan jumlah yang akan disetor: ");
                    double jumlahSetor = sc04.nextDouble();
                    bank.setorKeRekening(nomorRekeningSetor, jumlahSetor);
                    break;
                case 8:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak valid. Mohon pilih opsi yang sesuai.");
            }
        }
    }
}