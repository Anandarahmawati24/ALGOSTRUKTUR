package Jobsheet12;

public class Graph4 {
    int vertex;
    DoubleLinkedList4 list[];

    public Graph4(int v) {
        vertex = v;
        list = new DoubleLinkedList4[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList4();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        // list[tujuan].addFirst(asal, jarak); // untuk graf tak berarah
    }

    public boolean isNeighbour(int node1, int node2) {
        // Cek apakah node1 dan node2 saling bertetangga
        Node4 current = list[node1].getHead();
        while (current != null) {
            if (current.data == node2) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                Node4 current = list[i].getHead();
                while (current != null) {
                    System.out.print((char) ('A' + current.data) + "(" + current.jarak + " m), ");
                    current = current.next;
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
}