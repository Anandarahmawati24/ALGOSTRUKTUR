import java.util.Scanner;
public class Pemilihan04{
public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);
    int tugas,kuis,UTS,UAS;
    System.out.println(" Program Menghitung Nilai Akhir");
    System.out.println("======================");
    System.out.print(" Masukkan Nilai Tugas: ");
    tugas = input04.nextInt();
    System.out.print(" Masukkan Nilai Kuis: ");
    kuis = input04.nextInt();
    System.out.print(" Masukkan Nilai UTS: ");
    UTS=input04.nextInt();
    System.out.print(" Masukkan Nilai UAS: ");
    UAS = input04.nextInt();

    System.out.println("=======================");
    System.out.println("=======================");

    double hitungNilai =0;
    if ((tugas >=0 && tugas <= 100) && (kuis >= 0 && kuis <=100) && (UTS >= 0 && UTS<= 100) && (UAS>=0 && UAS<=100)){
    hitungNilai = ((tugas * 0.2)+ (kuis * 0.2)+(UTS*0.3)+(UAS*0.3));
    System.out.println(" Nilai Akhir : "+hitungNilai);
    } else {
        System.out.println(" Nilai tidak valid");
    }

    if (hitungNilai> 80 && hitungNilai <= 100){
    System.out.println(" Nilai  Huruf : A ");
    }else if (hitungNilai >73 && hitungNilai<= 80){
        System.out.println(" Nilai Huruf: B+");
    }else if (hitungNilai > 65 && hitungNilai <=73){
        System.out.println(" Nilai Huruf: B ");
    }else if (hitungNilai > 60 && hitungNilai<=65){
        System.out.println(" Nilai Huruf : C+");
    }else if (hitungNilai > 50 && hitungNilai<= 60){
        System.out.println(" Nilai Huruf : C");
    }else if (hitungNilai > 39 && hitungNilai<= 50){
        System.out.println(" Nilai Huruf : D ");
    }else {
        System.out.println(" Nilai Huruf : E ");
    }

System.out.println("=======================");
System.out.println("=======================");
if (hitungNilai > 50 && hitungNilai <= 100){
    System.out.println(" SELAMAT ANDA LULUS ");
} else {
    System.out.println(" ANDA TIDAK LULUS ");
}
}
}