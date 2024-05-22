package Jobsheet10;

public class dllVaksin {
    Nvaksin head, tail;
    int size;

    public dllVaksin() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void enqueue(int Noantrian, String nama) {
        Nvaksin newNode = new Nvaksin(Noantrian, nama);
        if (isEmpty()) {
            head= tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        System.out.println("Nomor antrian " + Noantrian + " dengan nama " + nama + "  telah di tambahkan dalam antrian");
}

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("antrian kosong.");
            return null;
        }
        String nama = head.nama;
        head= head.next;
        if (head == null) {
            tail= null;
        } else {
            head.prev = null;
        }
        size--;
        System.out.println(nama + " telah divaksinasi dan dihapus dari antrian.");
        return nama;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("antrian kosong.");
            return;
        }
        Nvaksin current = head;
        System.out.println("Daftar Pengantri Vaksin");
        System.out.println("| Nomor     | Nama    |");
        while (current != null) {
            System.out.printf("| %-9d | %-7s |\n", current.noAntri, current.nama);
            current = current.next;
        }
        System.out.println("+-----------+----------+");
        System.out.println("Sisa Antrian " + size);
}
}