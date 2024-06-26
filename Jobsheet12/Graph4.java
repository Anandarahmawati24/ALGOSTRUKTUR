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

    public void removeEdge(int source, int destination) throws Exception {
        if (source < 0 || source >= vertex || destination < 0 || destination >= vertex) {
            throw new Exception("Nilai indeks diluar batas");
        }
        
        // Cek apakah destination ada di list[source]
        boolean foundSource = list[source].remove(destination);
    
        // Jika tidak ditemukan di list[source], coba cari di list[destination]
        if (!foundSource) {
            foundSource = list[destination].remove(source);
        }
    
        if (!foundSource) {
            throw new Exception("Edge tidak ditemukan.");
        }
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;

        // Menghitung inDegree
        for (int i = 0; i < vertex; i++) {
            Node4 current = list[i].getHead();
            while (current != null) {
                if (current.data == asal) {
                    totalIn++;
                }
                current = current.next;
            }
        }

        // Menghitung outDegree
        totalOut = list[asal].size();

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
    }

    public boolean isEdgeExist(int asal, int tujuan) {
        Node4 current = list[asal].getHead();
        while (current != null) {
            if (current.data == tujuan) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printGraph() {
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