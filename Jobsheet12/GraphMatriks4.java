package Jobsheet12;

public class GraphMatriks4 {
    int vertex;
    int[][] matriks;

    public GraphMatriks4(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) throws Exception {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        matriks[asal][tujuan] = -1;
    }

    public int inDegree(int node) {
        int count = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][node] != -1) {
                count++;
            }
        }
        return count;
    }

    public int outDegree(int node) {
        int count = 0;
        for (int j = 0; j < vertex; j++) {
            if (matriks[node][j] != -1) {
                count++;
            }
        }
        return count;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }
}