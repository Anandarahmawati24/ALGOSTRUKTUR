package Jobsheet9;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL02 = new SingleLinkedList();
        singLL02.print();
        singLL02.addFirst(890);
        singLL02.print();
        singLL02.addLast(760);
        singLL02.print();
        singLL02.addFirst(700);
        singLL02.print();
        singLL02.insertAfter(760, 999);
        singLL02.print();
        singLL02.insertAt(3, 833);
        singLL02.print();

        System.out.println("Data pada indeks ke-1= " + singLL02.getData(1));
        System.out.println("Data 760 berada pada indeks ke-" + singLL02.indexOf(999));
 
        singLL02.remove(760);
        singLL02.print();
        singLL02.removeAt(2);
        singLL02.print();
        singLL02.removeFirst();
        singLL02.print();
        singLL02.removeLast();
        singLL02.print();
        
    }
}
