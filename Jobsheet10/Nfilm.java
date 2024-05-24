package Jobsheet10;

public class Nfilm {
    int id;
    String judul;
    double rating;
    Nfilm prev, next;

    Nfilm(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}