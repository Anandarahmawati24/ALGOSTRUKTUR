package Jobsheet3;
import java.util.Scanner;
public class bangunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        limas[] lms = new limas[3];
        kerucut[] Krct = new kerucut[3];
        bola[] bla = new bola[3];
 
    for (int i = 0; i < Krct.length; i++) {
            Krct[i] = new kerucut();
            bla[i] = new bola();
            lms[i] = new limas();
        }

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.printf("%n");
                System.out.println("kerucut");
                System.out.print("masukkan jari - jari : ");
                Krct[i].jariJari = sc.nextDouble();
                System.out.print("masukkan sisi miring :");
                Krct[i].sisiMiring = sc.nextDouble();
                 
 
            } else if (i == 1) {
                System.out.printf("%n");
                System.out.println("limas segi empat sama sisi");
                System.out.print("masukkan panjang sisi alas : ");
                lms[i].panjangSisiAlas = sc.nextInt();
                System.out.print("masukkan tinggi limas :");
                lms[i].tinggi = sc.nextInt();
                
            } else if (i == 2) {
                System.out.printf("%n");
                System.out.println("Bola");
                System.out.print("masukkan jari jari bola :");
                bla[i].jari_jari = sc.nextInt();
                
            }
        }

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.printf("%n");
                System.out.println("luas permukaan kerucut :" + Krct[i].hitungLuasPermukaan());
                System.out.println("volume kerucut : " + Krct[i].hitungVolume());
            } else if(i == 1){
                System.out.printf("%n");
                System.out.println("luas permukaan limas :" + lms[i].hitungLuasPermukaan());
                System.out.println("volume limas : " + lms[i].hitungVolume());
            }
            else if(i==2){
                System.out.printf("%n");
                System.out.println("luas permukaan bola :" + bla[i].hitungLuasPermukaan());
                System.out.println("volume bola : " + bla[i].hitungVolume());
            }
            
        }
    }
}