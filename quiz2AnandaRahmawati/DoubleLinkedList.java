package quiz2AnandaRahmawati;

public class DoubleLinkedList {
    Node head, tail;
    int size;
    
    DoubleLinkedList(){
        head = tail = null;
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    void addFirst(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
            nu.n = head;
            head.p = nu;
            head = nu;
        }
        size++;
    } 
    void deleteFirst(){
        head = head.n;
        head.p = null;
        size--;
    }
    void print(){
        Node tmp = head;
        while(tmp!=null){
            System.out.print(""+tmp.data+"-");
            tmp = tmp.n;
        }
        System.out.println("");
    } 
    //Soal No 1 Kode Ganjil
    void addLast(int data){
        if (isEmpty()){
            addFirst(data);
        } else {
            Node current = head;
            while (current.n != null) {
                current = current.n;
            }
            Node newNode = new Node(current, data, null);
            current.n = newNode;
            size++;
        }
        
    }
    //Soal No 1 Kode Genap
    void deleteLast(){
       
    }

    //Soal No 2 Kode Ganjil dan Genap
    void printFromTail(){
        Node tmp = head;
        if (isEmpty()) {
            System.out.println("isi linked list kosong");
        } else {
            while (tmp.n != null) {
                tmp = tmp.n;
            }
            while (tmp != null) {
                System.out.print(""+tmp.data+"-");
                tmp = tmp.p;
            }
        }
        System.out.println("");
    }
}