package Jobsheet9;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.print();
        singleLinkedList.addFirst(890);
        singleLinkedList.print();
        singleLinkedList.addLast(760);
        singleLinkedList.print();
        singleLinkedList.addFirst(700);
        singleLinkedList.print();
        singleLinkedList.insertAfter(760, 999);
        singleLinkedList.print();
        singleLinkedList.insertAt(3, 833);
        singleLinkedList.print();

        System.out.println("Data pada indeks ke-1= " + singleLinkedList.getData(1));
        System.out.println("Data 760 berada pada indeks ke-" + singleLinkedList.indexOf(999));
 
        singleLinkedList.remove(760);
        singleLinkedList.print();
        singleLinkedList.removeAt(2);
        singleLinkedList.print();
        singleLinkedList.removeFirst();
        singleLinkedList.print();
        singleLinkedList.removeLast();
        singleLinkedList.print();
        
    }
}