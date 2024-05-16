package Jobsheet9;

public class sllAntrian {
    private Nantrian head, tail;
    private int Size;

    public sllAntrian() {
        head = tail = null;
        Size = 0;
    }

    public boolean isEmpty() {
        return (Size == 0);
    }
    public void print(){
        if(isEmpty())
            System.out.println("SLL kosong!!!");
        else{
            Nantrian tmp = head;
            while(tmp!=null){
                tmp.data.print();
                tmp = tmp.next;
            }
        }
    }

    public void enqueue(mhsAntrian mhs) {
        Nantrian node = new Nantrian(mhs);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        Size++;
        System.out.println(mhs.noAntrian+"." +mhs.nama + " ditambahkan pada antrian");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("antrian kosong");
            return;
        }
        mhsAntrian mhs = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        Size--;
        System.out.println( mhs.nama + " telah dilayani");
    }

    public mhsAntrian peek() {
        if (isEmpty()) {
            System.out.println("antrian kosong");
            return null;
        } else{
        return head.data;
    }
}

    public int Size() {
        return Size;
    }
}