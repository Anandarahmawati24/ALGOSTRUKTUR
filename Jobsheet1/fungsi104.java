import java.util.Scanner;
public class fungsi104{
    static Scanner input04 = new Scanner(System.in);
    static String [] tokoBunga = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    static int [][] stock = {
        { 10, 5, 15, 7},
        { 6, 11, 9, 12},
        { 2, 10, 10, 5},
        { 5, 7, 12, 9}
    };
    static int [] PenguranganStock = { -1, -2, 0, -5};
    static double [] totalPendapatan = new double [4];
    public static void main(String[] args) {
        System.out.printf("%-20s%20s%20s%20s%20s\n", "Toko Bunga", " Aglonema", "Keladi", " Alocasia", " Mawar");
        for (int i = 0; i< tokoBunga.length; i++){
            System.out.printf("%-20s", tokoBunga [i]);
            for (int j =0; j<stock[i].length; j++){
                System.out.printf("%20d", stock [i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Fungsi Pertama: ");
        for (int i=0; i<tokoBunga.length; i++){
            fungsiPendapatanCabang(i);
        }
        System.out.println();
        System.out.print("Fungsi Kedua: ");
        PenguranganStock();
    }
    static void fungsiPendapatanCabang(int indeks){
        double totalAglonema = stock [indeks][0]* 75000;
        double totalKeladi = stock [indeks][1] * 50000;
        double totalAlocasia = stock [indeks][2]* 60000;
        double totalMawar = stock [indeks][3]*10000;
        totalPendapatan[indeks]=totalAglonema+totalKeladi+totalAlocasia+totalMawar;
        System.out.println(" Total pendapatan " +tokoBunga[indeks] + " adalah: " + totalPendapatan[indeks]);
    }
    static void PenguranganStock(){
        int[] stockKurang = { -1, -2, 0, -5};
        for (int i = 0; i< stock[3].length; i++){
            stock [3][i] += stockKurang[i];
        }
        System.out.printf("\n%-20s %20d %20d %20d %20d", tokoBunga[3], stock[3][0], stock [3][1], stock [3][2], stock [3][3]);
    }
}