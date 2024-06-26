package Jobsheet13;

public class BinaryTree04 {
    Node04 root;

    public BinaryTree04(){
        root = null;
    }
    
    boolean isEmpty(){
         return root == null;
    }

    void addRecursive(Node04 node, int data) {
        if (data < node.data) {
            if (node.left != null) {
                addRecursive(node.left, data);
            } else {
                node.left = new Node04(data);
            }
        } else if (data > node.data) {
            if (node.right != null) {
                addRecursive(node.right, data);
            } else {
                node.right = new Node04(data);
            }
        }
    }
    
    void add(int data) {
        if (isEmpty()) {
            root = new Node04(data);
        } else {
            addRecursive(root, data);
        }
    }

    boolean find(int data) {
        return findRecursive(root, data);
    }

    private boolean findRecursive(Node04 node, int data) {
        if (node == null) {
            return false;
        } else if (node.data == data) {
            return true;
        } else if (data < node.data) {
            return findRecursive(node.left, data);
        } else {
            return findRecursive(node.right, data);
        }
    }

    void traversePreOrder(Node04 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node04 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node04 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node04 getSuccessor (Node04 del) {
        Node04 successor = del.right;
        Node04 successorParent = del;
        while(successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data){
        root = deleteRecursive(root, data);
    }

    private Node04 deleteRecursive(Node04 node, int data) {
        if (node == null) {
            return null;
        }

        if (data < node.data) {
            node.left = deleteRecursive(node.left, data);
        } else if (data > node.data) {
            node.right = deleteRecursive(node.right, data);
        } else {
            // Node to delete found

            // Case 1: No child or only one child
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            // Case 2: Node with two children
            Node04 successor = getSuccessor(node);
            node.data = successor.data;
            node.right = deleteRecursive(node.right, successor.data);
        }
        return node;
    }

    int findMinValue() {
        if (isEmpty()) {
            throw new IllegalStateException("Tree is empty.");
        }
        return findMinValue(root);
    }

    private int findMinValue(Node04 node) {
        if (node.left == null) {
            return node.data;
        }
        return findMinValue(node.left);
    }

    int findMaxValue() {
        if (isEmpty()) {
            throw new IllegalStateException("Tree is empty.");
        }
        return findMaxValue(root);
    }

    private int findMaxValue(Node04 node) {
        if (node.right == null) {
            return node.data;
        }
        return findMaxValue(node.right);
    }

    void displayMinMaxValues() {
        if (isEmpty()) {
            System.out.println("Tree is empty.");
        } else {
            int minValue = findMinValue();
            int maxValue = findMaxValue();
            System.out.println("Minimum value in the tree: " + minValue);
            System.out.println("Maximum value in the tree: " + maxValue);
        }
    }

    void displayLeafNodes() {
        if (isEmpty()) {
            System.out.println("Tree is empty.");
        } else {
            System.out.print("Leaf nodes: ");
            displayLeafNodes(root);
            System.out.println();
        }
    }

    private void displayLeafNodes(Node04 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            displayLeafNodes(node.left);
            displayLeafNodes(node.right);
        }
    }

    int countLeafNodes() {
        return countLeafNodes(root);
    }

    private int countLeafNodes(Node04 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }
}