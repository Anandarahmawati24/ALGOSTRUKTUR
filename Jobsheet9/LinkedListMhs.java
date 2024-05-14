package Jobsheet9;

public class LinkedListMhs {
    Ntugas head;
    int size;
    public LinkedListMhs(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void print(){
        if(isEmpty())
            System.out.println("SLL kosong!!!");
        else{
            Ntugas tmp = head;
            while(tmp!=null){
                tmp.data.print();
                tmp = tmp.next;
            }
        }
    }
    public void addFirst(Mahasiswa mhs){
        Ntugas newNode = new Ntugas(mhs);
        if(isEmpty()){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public void addLast(Mahasiswa mhs){
        Ntugas newNode = new Ntugas(mhs);
        if(isEmpty()){
            head = newNode;
        }else{
            Ntugas tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
        size++;
    }
    public void insertAfter(String afterNim, Mahasiswa mhs){
        if(isEmpty()){
            addFirst(mhs);
        }else{
            Ntugas tmp = head;
            while(tmp!=null){
                if(tmp.data.nim.equalsIgnoreCase(afterNim)){
                    Ntugas newNode = new Ntugas(mhs);
                    newNode.next = tmp.next;
                    tmp.next = newNode;
                    size++;
                    break;
                }else{
                    tmp = tmp.next;
                }
            }
        }
    }
    public void insertAt(int idx, Mahasiswa mhs){
        if(isEmpty()||idx==0){
            addFirst(mhs);
        }else if(idx==size){
            addLast(mhs);
        }else{
            Ntugas tmp = head;
            for(int i=0; i<idx-1;i++){
                tmp = tmp.next;
            }
            Ntugas newNode = new Ntugas(mhs);
            newNode.next = tmp.next;
            tmp.next = newNode;
            size++;
        }
    }
}