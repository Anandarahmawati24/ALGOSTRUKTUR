package Jobsheet3;
import java.util.Scanner;
public class ArrayObjects04 {
    public static class PersegiPanjang {
        public int panjang;
        public int lebar;
    }
     
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.print("Masukkan jumlah persegi panjang:");
    int jumlahPersegi = sc.nextInt();
    
    PersegiPanjang[] ppArray = new PersegiPanjang[jumlahPersegi];
     for (int i =0; i<3; i++ ) {
        ppArray[i] = new PersegiPanjang();
        System.out.println("Persegi Panjang ke-" + i);
        System.out.print("Masukkan panjang: ");
        ppArray[i].panjang = sc.nextInt();
        System.out.print("Masukkan Lebar:  ");
        ppArray[i].lebar =sc.nextInt();
     }

     for(int i=0; i<3; i++) {
        System.out.println("Persegi panjang ke-" +i);
        System.out.println("Panjang: " +ppArray[i].panjang +", lebar: " +ppArray[i].lebar);
     }
}
}