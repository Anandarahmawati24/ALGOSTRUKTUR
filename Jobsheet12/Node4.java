package Jobsheet12;

public class Node4 {
    int data , jarak;
    Node4 prev , next;
    Node4(Node4 prev, int data, int jarak, Node4 next) {
        this.prev= prev;
        this.data= data;
        this.next = next;
        this.jarak = jarak;
    }
}