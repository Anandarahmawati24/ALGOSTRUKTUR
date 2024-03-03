package Jobsheet3;
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int jumlahMahasiswa = 3;
        mahasiswa[] daftarMahasiswa = new mahasiswa[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = p.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = p.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            char jenisKelamin = p.nextLine().charAt(0);
            System.out.print("Masukkan IPK: ");
            double ipk = p.nextDouble();
            p.nextLine(); 

            daftarMahasiswa[i] = new mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        System.out.println("\nData Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ":");
            System.out.println("Nama: " + daftarMahasiswa[i].getNama());
            System.out.println("NIM: " + daftarMahasiswa[i].getNim());
            System.out.println("Jenis Kelamin: " + daftarMahasiswa[i].getJenisKelamin());
            System.out.println("IPK: " + daftarMahasiswa[i].getIpk());
            System.out.println();
        }
    }
}