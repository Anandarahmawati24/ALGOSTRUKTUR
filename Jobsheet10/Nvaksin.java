package Jobsheet10;
public class Nvaksin {
    String nama;
    int noAntri;
    Nvaksin prev, next;

    public Nvaksin(int no, String nama) {
        this.nama = nama;
        this.prev = null;
        this.next = null;
        noAntri=no;
    }
}