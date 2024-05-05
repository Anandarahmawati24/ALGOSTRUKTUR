package Jobsheet8;

public class queuePembeli {
    pembeli [] data;
    int front, rear, size,max;

    public queuePembeli(int n) {
        max=n;
        data = new pembeli[max];
        size =0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size ==0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean IsFull () {
        if (size == max) {
            return true;
        }else {
            return false;
        }
    }

    public void Enqueue (pembeli dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        }else {
            if (IsEmpty()) {
                front = rear = 0;
            }else {
                if (rear == max -1) {
                    rear = 0;
                }else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public pembeli Dequeue() {
        pembeli dt = new pembeli();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        }else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            }else {
                if (front == max - 1) {
                    front = 0;
                }else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        }else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i].nama + " " + data[i].noHP + " " );
                i = (i+1) % max;
            }
            System.out.println(data[i].nama + " " + data[i].noHP+ " " );
            System.out.println("Jumlah elemen = " + size);
    }
}

public void peek() {
    if (!IsEmpty()) {
        System.out.println("Elemen terdepan: " + data[front].nama + " " + data[front].noHP + " ");
    }else {
        System.out.println("Queue masih kosong");
    }
}

public void peekrear() {
    if (!IsEmpty()) {
        System.out.println("Elemen paling belakang: " + data[rear].nama + " " + data[rear].noHP + " " );
    }else {
        System.out.println("Queue masih kosong");
    }
}

public void peekPosition(String nama) {
    if (!IsEmpty()) {
        int i = front;
        int pos = 1;
        while (i != rear) {
            if (data[i].nama.equals(nama)) {
                System.out.println("Pembeli " + nama + " berada di posisi antrian ke-" + pos);
                return;
            }
            i = (i + 1) % max;
            pos++;
        }
        if (data[rear].nama.equals(nama)) {
            System.out.println("Pembeli " + nama + " berada di posisi antrian ke-" + pos);
            return;
        }
        System.out.println("Pembeli " + nama + " tidak ditemukan dalam antrian.");
    } else {
        System.out.println("Antrian kosong!");
    }
}

public void daftarPembeli() {
    if (!IsEmpty()) {
        int i = front;
        while (i != rear) {
            System.out.println(data[i].nama + " " + data[i].noHP);
            i = (i + 1) % max;
        }
        System.out.println(data[rear].nama + " " + data[rear].noHP);
    } else {
        System.out.println("Antrian kosong!");
    }
}
}