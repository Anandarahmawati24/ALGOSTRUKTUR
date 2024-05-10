package Jobsheet9;

public class SingleLinkedList {
    Node head, tail ;

    public SingleLinkedList(){
        head = null;
        tail = null;
    }

    boolean isEmpty(){
        //return head != null;
        return head == null;
    }

    void print(){
        if(!isEmpty()){
            Node tmp = head;
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
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
            //ndInput.next = head;
            //head = ndInput;
        } else {
            //head = ndInput;
            //tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
            //tail.next = ndInput;
            //tail = ndInput;
        } else {
            //head = ndInput;
            //tail = ndInput;
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    void insertAfter (int key, int input){
        Node ndInput = new Node(input, null);//ganti new Node02(input, null)
        Node temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next ==null) {//ganti dengan ==
                    tail=ndInput;
                    break;
                }
            }
            temp = temp.next;
        }
        while(temp != null);//ganti dengan !=
    }

    void insertAt(int index, int input){
        //Node02 ndInput = new Node02(input, null); //tidak usah
        if (index < 0){
            System.out.println("perbaiki logikanya!"
            + "kalau indeksnya -1 bagaimana???");
        } else if (index == 0) {
            addFirst(input);
        } else{
            Node temp = head;
            for (int i=0; i<index-1; i++){
                temp = temp.next;
            }

            temp.next = new Node(input, temp.next);
            //JIKA DIURAI
            //Node02 ndInput = new Node02(input, null);
            //ndInput.next = temp.next;
            //temp.next = ndInput;
            if(temp.next.next==null){
                tail=temp.next;
            }
        }
    }
    int getSize(){
        int count = 0;
        Node tmp = head;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        System.out.println(count);
        return count;
    }
    int getData(int index){
        /*if(index < 0){
            System.out.println("Index tidak bisa negatif!");
            return;
        }else if(index>getSize()-1){
            System.out.println("Index max = "+(getSize()-1));
            return;
        }else{*/
            Node tmp = head;
           for (int i = 0; i < index; i++){ //syarat i < index
                tmp = tmp.next;
            }
           // return tmp.next.data;
            return tmp.data; //langsung tmp.data
        //}
    }

    int indexOf(int key){
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data !=key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {//jika tmp == null atau data tdk temu
            return -1; //return -1
        } else{
            return index;
        }
    }
 
    void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked list masing kosong, "
            + "tidak dapat dihapus");
        } else if (head == tail) {//jika head == tail
            head  = tail = null;
        }else{
            head = head.next;
        }
    }
 
    void removeLast(){
        if (isEmpty()) {//edit !
            System.out.println("Linked list masing kosong, "
            + "tidak dapat dihapus");
        } else if (head == tail){//edit ==
            head = tail = null;
        } else{
            Node temp = head;
            while (temp.next.next != null) {//edit
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;//edit
        }
    }
 
    void remove(int key){
        if(isEmpty()){//edit
            System.out.println("Linked list masih kosong"
            + "tidak dapat dihapus");
        }else{
            Node temp = head;
            while (temp!=null) {
                if(temp.data == key && temp==head){//edit ==
                    removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }


    public void removeAt(int index){
        if (index == 0){
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i<index -1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
    }
}