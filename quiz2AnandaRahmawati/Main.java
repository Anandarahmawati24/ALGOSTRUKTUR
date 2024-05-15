package quiz2AnandaRahmawati;

public class Main {
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        dll.printFromTail();
        //lanjutkan dengan memanggil method addLast, deleteLast, printFromTail
        dll.addLast(400);
        dll.print();
        dll.printFromTail();
        //lanjutkan dengan memanggil method merge, split
        DoubleLinkedList dll1 = new DoubleLinkedList();
        dll1.addFirst(45);
        dll1.addFirst(10);
        dll1.addFirst(10);

        DoubleLinkedList dll2 = new DoubleLinkedList();
        dll2.addFirst(15);
        dll2.addFirst(400);

        merge(dll1, dll2);

        dll1.print();
    }
    //No. 3 Kode Ganjil
    public static void merge(DoubleLinkedList dll1,
            DoubleLinkedList dll2){
                if (dll1.isEmpty()) {
                    dll1.head = dll2.head;
                    dll1.tail = dll2.tail;
                } else if (!dll2.isEmpty()) {
                    dll1.tail.n = dll2.head;
                    dll2.head.p = dll1.tail;
                    dll1.tail = dll2.tail;
                }
            }

    //No. 3 Kode Genap
    public static void split(DoubleLinkedList dll){
        //ex: 2,3,4,34,2,3,45,4 (original list)
        //list 1-> 2,3,4,34
        //list 2-> 2,3,45,4
    }
}
