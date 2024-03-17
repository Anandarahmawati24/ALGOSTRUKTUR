package Jobsheet4;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc.nextInt();
        
        Sum[] perusahaan = new Sum[jumlahPerusahaan];
        for (int i = 0; i < jumlahPerusahaan; i++) {
            sc.nextLine(); 
            System.out.print("Masukkan nama perusahaan ke-" + (i + 1) + ": ");
            String namaPerusahaan = sc.nextLine();
            System.out.print("Masukkan jumlah bulan keuntungan " + namaPerusahaan + ": ");
            int jumlahBulan = sc.nextInt();
            perusahaan[i] = new Sum(namaPerusahaan, jumlahBulan);
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (j + 1) + " untuk perusahaan " + namaPerusahaan + ": ");
                double keuntungan = sc.nextDouble();
                
                perusahaan[i].KeuntunganBulanan(j + 1, keuntungan);
            }
        }
        System.out.println("\nTotal keuntungan setiap perusahaan (Brute Force):");
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Perusahaan " + perusahaan[i].nama + ": " + perusahaan[i].hitungTotalKeuntunganBruteForce());
        }

        System.out.println("\nTotal keuntungan setiap perusahaan (Divide and Conquer):");
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Perusahaan " + perusahaan[i].nama + ": " + perusahaan[i].hitungTotalKeuntunganDivideConquer());
        }
        sc.close();
}
}