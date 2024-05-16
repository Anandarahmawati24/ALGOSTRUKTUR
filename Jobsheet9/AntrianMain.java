package Jobsheet9;

public class AntrianMain {
    public static void main(String[] args) {
        sllAntrian queue = new sllAntrian();
        queue.enqueue(new mhsAntrian(1," 112","jeno"));
        queue.enqueue(new mhsAntrian(2, " 113","lucas"));
        queue.enqueue(new mhsAntrian(3," 114","jaehyun"));
        queue.enqueue(new mhsAntrian(4, " 115","mingyu"));
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("jumlah antrian: " + queue.Size());
        System.out.println("---------------------------------");
        queue.print();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Antrian paling depan adalah: " + queue.peek().nama);
        System.out.println("---------------------------------");
        queue.dequeue();
        System.out.println("---------------------------------");
        System.out.println("jumlah antrian: " + queue.Size());
        System.out.println("---------------------------------");
        queue.print();
        System.out.println();
        System.out.println("----------------------------------------");
        queue.enqueue(new mhsAntrian(5,"116", "byeonwooseok"));
        System.out.println("----------------------------------------");
        queue.print();
        System.out.println("---------------------------------");
        System.out.println("jumlah antrian: " + queue.Size());
        System.out.println("---------------------------------");
        System.out.println("antrian paling depan: " + queue.peek().nama);
        System.out.println("---------------------------------");
        queue.dequeue();
        System.out.println("---------------------------------");
        System.out.println("jumlah antrian: " + queue.Size());
        System.out.println("---------------------------------");
        queue.print();
    } 
}