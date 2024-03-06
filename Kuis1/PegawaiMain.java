package Kuis1;
import java.util.Scanner;

public class PegawaiMain {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
       System.out.print("masukkan jumlah Pegawai: ");
        int jumlahPegawai = input04.nextInt();
        Pegawai [] arryPegawai = new Pegawai [jumlahPegawai];
        input04.nextLine();

        for ( int i =0; i<jumlahPegawai; i++){
            System.out.println("Masukkan data pegawai ke " +(i+ 1));
            System.out.print("Masukkan Nama Pegawai: ");
            String nama = input04.nextLine();
            System.out.print("Masukkan Masa Kerja (tahun): ");
            int masaKerjaThn= input04.nextInt();
            System.out.print("Masukkan jam lembur: ");
            double jamLembur = input04.nextDouble();
            System.out.print("Masukkan gaji pokok: ");
            int gajiPokok = input04.nextInt();
            input04.nextLine();

            arryPegawai[i] = new Pegawai(nama, masaKerjaThn, jamLembur, gajiPokok);
        }
        for (int i=0; i<jumlahPegawai; i++){
            System.out.println("Data Pegawai ke " +(i+1));
            arryPegawai[i].printData();
        }

        double totalGaji = 0;
        int hitungPegawai = 0;
        for (int i=0; i<jumlahPegawai; i++) {
            if (arryPegawai[i].masaKerjaThn > 5) {
                totalGaji += arryPegawai[i].hitungGajiTotal();
                hitungPegawai++;
            }
        }
        double rataGaji = totalGaji/ hitungPegawai;
        System.out.println("Rata - rata gaji pegawai dengan masa kerja >5 tahun adalah: " +rataGaji);

        double MaxLembur = arryPegawai[0].hitungGajiLembur();
        int indexMaxLembur = 0;
        for (int i = 1; i < jumlahPegawai; i++) {
            double gajiLembur = arryPegawai[i].hitungGajiLembur();
            if (arryPegawai[i].masaKerjaThn < 5 && gajiLembur > MaxLembur) {
                MaxLembur = gajiLembur;
                indexMaxLembur = i;
            }
        }
        if (indexMaxLembur >= 0) {
            System.out.println("Pegawai dengan gaji lembur terbesar (< 5 thn): " + arryPegawai[indexMaxLembur].nama);
            arryPegawai[indexMaxLembur].printData();
        } else {
            System.out.println("Tidak ada pegawai dengan masa kerja < 5 thn.");
        }  
    }
}