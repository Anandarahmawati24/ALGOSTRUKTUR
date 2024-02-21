import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] KOTA = {
            {"B","A","N","T","E","N"},
            {"J","A","K","A","R","T","A"},
            {"B","A","N","D","U","N","G",},
            {"C","I","R","E","B","O","N"},
            {"B","O","G","O","R"},
            {"P","E","K","A","L","O","N","G","A","N"},
            {"S", "E", "M", "A", "R", "A", "N", "G"},
            {"S", "U", "R", "A", "B", "A", "Y", "A"},
            {"M", "A", "L", "A", "N", "G"},
            {"T", "E", "G", "A", "L"}
        };
        Scanner input04 = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char kodePlat = input04.next().charAt(0);
        
        int index = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat) {
               index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.print("Kota dengan kode " + kodePlat + " : ");
            for (int j = 0; j < KOTA[index].length; j++) {
                System.out.print(KOTA[index][j] + " ");
            }
        } else {
            System.out.println("Kode plat " + kodePlat + " tidak ditemukan.");
        }
    }
}