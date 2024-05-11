package Jobsheet10;

public class DoubleLinkedList {
    Node04 head;
    int size;

    public DoubleLinkedList () {
        head = null;
        size=0;
    }

    public boolean isEmpty () {
        return head == null;
    }

    public void addFirst (int item) {
        if (isEmpty()) {
            head = new Node04(null, item, null);
        }else {
            Node04 newNode = new Node04(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size ++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        }else {
            Node04 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node04 newNode = new Node04(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add (int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node04 current = head;
            int i =0;
            while (i< index) {
                current=current.next;
                i++;
            }
        if (current.prev == null){
            Node04 newNode04 = new Node04(null, item, current);
            current.prev = newNode04;
            head = newNode04;
        } else {
            Node04 newNode04 = new Node04(current.prev, item, current);
            newNode04.prev = current.prev;
            newNode04.next = current;
            current.prev.next = newNode04;
            current.prev = newNode04;
        }
    }
    size++;
}
public int size(){
    return size;
}

public void clear () {
    head = null;
    size =0;
}

public void print() {
    if (!isEmpty()) {
        Node04 tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + "\t");
            tmp = tmp.next;
        }
        System.out.println("\nberhasil diisi");
    } else {
        System.out.println("Linked List Kosong");
    }
}

public void removeFirst ()  throws Exception {
    if (isEmpty()) {
        throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
    } else if (size ==1) {
        removeLast();
    }else {
        head = head.next;
        head.prev = null;
        size--;
    }
}

public void removeLast () throws Exception {
    if (isEmpty()) {
        throw new Exception("Linked list masih kosong tidak dapat dihapus!");
    } else if (head.next == null) {
        head = null;
        size --;
        return;
    } 
    Node04 current = head;
    while (current.next.next != null) {
        current= current.next;
    }
    current.next = null;
    size--;
    }

    public void remove (int index) throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("Nilai indeks diluar batas");
        } else if (index ==0) {
            removeFirst();
        } else {
            Node04 current = head;
            int i =0;
            while (i<index){
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null ;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev=current.prev;
            }
            size --;
        }
    }

    public int getFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        return head.data;
    }

    public int getLast () throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        Node04 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get (int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node04 tmp = head;
        for (int i =0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}