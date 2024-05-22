package Jobsheet10;

import java.util.Scanner;

public class vaksinMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dllVaksin queue = new dllVaksin();
        int pilihan;
        do {
            System.out.println("++++++++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++++++++++");
            System.out.println();
            System.out.println("1. Tambah data penerima vaksin");
            System.out.println("2. Hapus data pengantri vaksin");
            System.out.println("3. Daftar penerima vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++++++++");
            pilihan = scanner.nextInt();
            System.out.println("++++++++++++++++++++++++++++++++++++");
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nomor antrian: ");
                    int Noantrian = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("masukkan nama: ");
                    String nama = scanner.nextLine();
                    queue.enqueue(Noantrian, nama);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    System.out.println("keluar");
                    break;
                default:
                    System.out.println("pilihan tidak valid , silahakan pilih menu yang tersedia .");
                    break;
            }
        } while (pilihan != 4);
        scanner.close();
}
}