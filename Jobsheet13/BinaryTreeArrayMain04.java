package Jobsheet13;

public class BinaryTreeArrayMain04 {
    public static void main(String[] args) {
    BinaryTreeArray04 bta = new BinaryTreeArray04();
    int [] data ={6,4,8,3,5,7,9,0,0,0};
    int idxLast=6;
    bta.populateData(data, idxLast);
    System.out.print("\nInOrder Traversal: ");
    bta.traverseInOrder(0);
    System.out.print("\n");
    bta.add(10);
    bta.add(15);

    System.out.print("PreOrder Traversal: ");
    bta.traversePreOrder(0);
    System.out.println("");

    System.out.print("PostOrder Traversal: ");
    bta.traversePostOrder(0);
    System.out.println("");
}
}