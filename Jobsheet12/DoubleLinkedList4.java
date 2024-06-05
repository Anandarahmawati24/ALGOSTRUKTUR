package Jobsheet12;

public class DoubleLinkedList4 {
    Node4 head;
    int size;

    public DoubleLinkedList4 () {
        head = null;
        size=0;
    }

    public boolean isEmpty () {
        return head == null;
    }

    public void addFirst (int item, int jarak) {
        if (isEmpty()) {
            head = new Node4(null, item,jarak, null);
        }else {
            Node4 newNode = new Node4(null, item,jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size ++;
    }

    public void addLast(int item, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);;
        }else {
            Node4 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node4 newNode = new Node4(current, item, jarak, null);
            current.next = newNode;
            size++;
        }
    }

    public void add (int item, int jarak, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node4 current = head;
            int i =0;
            while (i< index) {
                current=current.next;
                i++;
            }
        if (current.prev == null){
            Node4 newNode04 = new Node4(null, item,jarak, current);
            current.prev = newNode04;
            head = newNode04;
        } else {
            Node4 newNode04 = new Node4(current.prev, item,jarak, current);
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
        Node4 tmp = head;
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
    Node4 current = head;
    while (current.next.next != null) {
        current= current.next;
    }
    current.next = null;
    size--;
    }

    public void remove (int index)  {
    Node4 current = head;
    while( current != null) {
        if (current.data == index) {
            if (current.prev != null) {
                current.prev.next = current.next;
            } else {
                head = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            break;
        }
        current=current.next;
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
        Node4 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get (int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node4 tmp = head;
        for (int i =0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        }
        Node4 tmp= head;
        for (int i=0; i <index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }
}