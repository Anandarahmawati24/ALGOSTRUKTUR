package Jobsheet12;

public class Graph4 {
    int vertex;
    DoubleLinkedList4[] list;

    public Graph4(int v) {
        vertex = v;
        list = new DoubleLinkedList4[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList4();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        // list[tujuan].addFirst(asal,jarak); apabila undirected graph
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
        }
        // outDegree
        totalOut = list[asal].size();
        
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("outDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
        // undirected graph
        // System.out.println("InDegree dari Gedung " + (char) ('A' +asal) + ": " + list[asal].size());
    }

    public void removeEdge(int source, int destination) throws Exception {
        if (source < 0 || source >= vertex || destination < 0 || destination >= vertex) {
            throw new Exception("Nilai indeks diluar batas");
        }
        
        boolean foundSource = false;

        for (int i = 0; i < list[source].size(); i++) {
            if (list[source].get(i) == destination) {
                list[source].remove(i);
                foundSource = true;
                break;
            }
        }

        if (!foundSource) {
            throw new Exception("Edge tidak ditemukan.");
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i=0; i <vertex; i++) {
            if (list[i].size() >0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j=0; j< list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + "(" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
}