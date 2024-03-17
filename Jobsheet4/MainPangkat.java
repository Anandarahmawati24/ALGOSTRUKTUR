package Jobsheet4;
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();
        Pangkat [] png = new Pangkat[elemen];
        for (int i=0; i<elemen; i++){
            png[i] = new Pangkat(i, i);
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            png[i].nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            png[i].pangkat = sc.nextInt();
        }
    System.out.println("1. Brute Force");
    System.out.println("2. Divide Conquer");
    System.out.println("Pilih Metode (1/2) : ");
    int choose = sc.nextInt();
    switch (choose) {
    case 1 :
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i=0; i<elemen; i++){
            System.out.println("Hasil dari " 
            + png[i].nilai + " pangkat " 
            + png[i].pangkat + " adalah "
            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        break;
    case 2 : 
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i=0; i<elemen; i++){
            System.out.println("Hasil dari " 
            + png[i].nilai + " pangkat " 
            + png[i].pangkat + " adalah "
            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
        break;
        default:
            System.out.println("Pilihan tidak valid.");
    }
        sc.close();
    }
}