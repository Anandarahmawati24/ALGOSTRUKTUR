package Jobsheet9;

public class LinkedListMhs {
    Ntugas head, tail ;

    public LinkedListMhs(){
        head = null;
        tail = null;
    }

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if(!isEmpty()){
            Ntugas tmp = head;
            System.out.println("Isi Linked List");
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int input){
        Ntugas ndInput = new Ntugas();
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input){
        Ntugas ndInput = new Ntugas();
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    void insertAfter (int key, int input){
        Ntugas ndInput = new Ntugas();
        Ntugas temp = head;
        do{
            if(temp.data.equals(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next ==null) {
                    tail=ndInput;
                    break;
                }
            }
            temp = temp.next;
        }
        while(temp != null);
    }

    void insertAt(int index, int input){
        if (index < 0){
            System.out.println("perbaiki logikanya!"
            + "kalau indeksnya -1 bagaimana???");
        } else if (index == 0) {
            addFirst(input);
        } else{
            Ntugas temp = head;
            for (int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = new Ntugas();
            if(temp.next.next==null){
                tail=temp.next;
            }
        }
    }
}