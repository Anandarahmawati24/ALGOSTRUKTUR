package Jobsheet9;
import java.util.LinkedList;

public class antrian {
    LinkedList<Mahasiswa> antrian;
    Mahasiswa[] data;
    int front, rear, size, max;

    public antrian(int n){
        antrian = new LinkedList<>();
         max=n;
        data = new Mahasiswa[max];
        size =0;
        front = rear = -1;
    }

    public void enqueue(Mahasiswa mahasiswa) {
        antrian.addLast(mahasiswa);
        System.out.println("Mahasiswa " + mahasiswa.nama + " dengan NIM " + mahasiswa.nim + " ditambahkan ke dalam antrian.");
    }

    public Mahasiswa dequeue(Mahasiswa mahasiswa) {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        return antrian.poll();
    }

    public Mahasiswa peek(Mahasiswa mahasiswa) {
        if (!isEmpty()) {
            System.out.println("Elemen paling belakang: " + data[rear].nama + " " + data[rear].nim + " " );
        }else {
            System.out.println("Queue masih kosong");
        }
        return antrian.peek();
    }

    public boolean isEmpty() {
        if (size == max) {
            return true;
        }else {
            return false;
        }
    }

    public int size() {
        return antrian.size();
    }


public static void main(String[] args) {
    Mahasiswa antrian = new Mahasiswa(null, 0);
    antrian.enqueue(new Mahasiswa("Anton", 111));
    antrian.enqueue(new Mahasiswa("Prita", 112));
    antrian.enqueue(new Mahasiswa("Yusuf", 113));
    antrian.enqueue(new Mahasiswa("Doni", 114));
    antrian.enqueue(new Mahasiswa("Sari", 115));
    
    System.out.println("Mahasiswa pertama yang akan dilayani: " + antrian.peek());

    System.out.println("Mahasiswa yang dilayani: " + antrian.dequeue());

    System.out.println("Apakah antrian kosong? " + antrian.isEmpty());

    System.out.println("Jumlah mahasiswa yang masih di antrian: " + antrian.size());
}
}