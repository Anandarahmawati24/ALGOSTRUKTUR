package Jobsheet3;
import java.util.Scanner;

public class ArrayObjects2D {
     public static class PersegiPanjang {
        public int panjang;
        public int lebar;
    }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    PersegiPanjang[][] ppArray2D = new PersegiPanjang[3][3];
     for (int i =0; i<3; i++ ) {
        for ( int j=0; j<3; j++) {
        ppArray2D[i][j] = new PersegiPanjang();
        System.out.println("Persegi Panjang ke-" + i+ "," +j);
        System.out.print("Masukkan panjang: ");
        ppArray2D[i][j].panjang = sc.nextInt();
        System.out.print("Masukkan Lebar:  ");
        ppArray2D[i][j].lebar =sc.nextInt();
     }
    }
     for(int i=0; i<3; i++) {
        for (int j=0; j<3; j++){
        System.out.println("Persegi panjang ke-" +i);
        System.out.println("Panjang: " +ppArray2D[i][j].panjang +", lebar: " +ppArray2D[i][j].lebar);
     }
    }
}

}