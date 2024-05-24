package Jobsheet10;

import java.util.Scanner;

public class filmMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        dllFilm filmList = new dllFilm();

        while (true) {
            System.out.println("===============================");
            System.out.println("DATA FILM LAYAR LEBAR ");
            System.out.println("===============================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating DESC");
            System.out.println("10. Keluar");
            System.out.println("===============================");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Masukkan data posisi awal");
                    System.out.print("Masukkan ID: ");
                    int id1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Judul: ");
                    String judul1 = scanner.nextLine();
                    System.out.print("Masukkan Rating: ");
                    double rating1 = scanner.nextDouble();
                    filmList.addFirst(id1, judul1, rating1);
                    break;
                case 2:
                    System.out.println("Masukkan data posisi akhir");
                    System.out.print("Masukkan ID: ");
                    int id2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Judul: ");
                    String judul2 = scanner.nextLine();
                    System.out.print("Masukkan Rating: ");
                    double rating2 = scanner.nextDouble();
                    filmList.addLast(id2, judul2, rating2);
                    break;
                case 3:
                    System.out.println("Masukkan data film urutan ke- ");
                    System.out.print("Masukkan Index: ");
                    int index = scanner.nextInt();
                    System.out.print("Masukkan ID: ");
                    int id3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Judul: ");
                    String judul3 = scanner.nextLine();
                    System.out.print("Masukkan Rating: ");
                    double rating3 = scanner.nextDouble();
                    filmList.addAtIndex(index, id3, judul3, rating3);
                    System.out.println("Data film ini akan masuk di urutan ke-" +index);
                    break;
                case 4:
                    System.out.println("hapus data awal");
                    filmList.removeFirst();
                    break;
                case 5:
                    System.out.println("hapus data akhir");
                    filmList.removeLast();
                    break;
                case 6:
                    System.out.println("hapus data index");
                    System.out.print("Masukkan Index: ");
                    int indexRemove = scanner.nextInt();
                    filmList.remove(indexRemove);;
                    break;
                case 7:
                    System.out.println("cetak data");
                    filmList.printList();
                    break;
                case 8:
                    System.out.println("cari data");
                    System.out.print("Masukkan ID: ");
                    int idSearch = scanner.nextInt();
                    filmList.searchById(idSearch);
                    break;
                case 9:
                    filmList.sortByRatingDescending();
                    System.out.println("Data telah diurutkan berdasarkan rating secara descending.");
                    filmList.printList();
                    break;
                case 10:
                    System.out.println("Keluar...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}