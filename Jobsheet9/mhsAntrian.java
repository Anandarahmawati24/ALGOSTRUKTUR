package Jobsheet9;

public class mhsAntrian {
    String nim, nama;
    int noAntrian;
    public mhsAntrian(){}
    public mhsAntrian(int no, String ni, String na){
        nim = ni;
        nama = na;
        noAntrian= no;
    }
    public void print(){
        System.out.println("No antrian = "+noAntrian);
        System.out.println("NIM = "+nim);
        System.out.println("Nama = "+nama);
    }
}