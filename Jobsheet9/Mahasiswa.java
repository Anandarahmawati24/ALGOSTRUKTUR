package Jobsheet9;
public class Mahasiswa {
        String nim, nama;
        public Mahasiswa(){}
        public Mahasiswa(String ni, String na){
            nim = ni;
            nama = na;
        }
        public void print(){
            System.out.println("NIM = "+nim);
            System.out.println("Nama = "+nama);
    }
}