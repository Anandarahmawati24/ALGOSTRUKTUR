package Jobsheet12;

import java.util.Scanner;

public class GraphMain4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Graph4 graf = new Graph4(6);

        int pilihan;
        do {
            System.out.println("Menu Program:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    try {
                        System.out.print("Masukkan node asal (0-5): ");
                        int asalAdd = scanner.nextInt();
                        System.out.print("Masukkan node tujuan (0-5): ");
                        int tujuanAdd = scanner.nextInt();
                        System.out.print("Masukkan jarak: ");
                        int jarakAdd = scanner.nextInt();
                        graf.addEdge(asalAdd, tujuanAdd, jarakAdd);
                        System.out.println("Edge berhasil ditambahkan.");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Masukkan node asal (0-5): ");
                        int asalRemove = scanner.nextInt();
                        System.out.print("Masukkan node tujuan (0-5): ");
                        int tujuanRemove = scanner.nextInt();
                        graf.removeEdge(asalRemove, tujuanRemove);
                        System.out.println("Edge berhasil dihapus.");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Masukkan node yang ingin dihitung degree-nya (0-5): ");
                        int nodeDegree = scanner.nextInt();
                        graf.degree(nodeDegree);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Graph saat ini:");
                        graf.printGraph();
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.print("Masukkan node asal (0-5): ");
                        int asalCek = scanner.nextInt();
                        System.out.print("Masukkan node tujuan (0-5): ");
                        int tujuanCek = scanner.nextInt();
                        boolean isEdgeExist = graf.isEdgeExist(asalCek, tujuanCek);
                        if (isEdgeExist) {
                            System.out.println("Edge antara node " + (char) ('A' + asalCek) + " dan node " + (char) ('A' + tujuanCek) + " ada.");
                        } else {
                            System.out.println("Edge antara node " + (char) ('A' + asalCek) + " dan node " + (char) ('A' + tujuanCek) + " tidak ada.");
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan pilihan 1-6.");
            }
            System.out.println();
        } while (pilihan != 6);

        scanner.close();
    }
}