package Jobsheet9;

public class mhsMain {
    public static void main(String[] args) {
        LinkedListMhs sll = new LinkedListMhs();
        sll.addFirst(new Mahasiswa("111", "anton"));
        sll.addLast(new Mahasiswa("115", "sari"));
        sll.insertAfter("111", new Mahasiswa("112", "prita"));
        sll.insertAfter("112", new Mahasiswa("113", "yusuf"));
        sll.insertAt(3, new Mahasiswa("114", "doni"));
        sll.print();
    }
}