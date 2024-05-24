package Jobsheet10;

public class dllFilm {
    Nfilm tail, head;
    int size;

    public dllFilm(){
    head = tail = null;
    size = 0;
    }

    public boolean isEmpty () {
        return head == null;
    }

    public void addFirst(int id, String judul, double rating) {
        Nfilm newFilm = new Nfilm(id, judul, rating);
        if (isEmpty()) {
            head = tail = newFilm;
        } else {
            newFilm.next = head;
            head.prev = newFilm;
            head = newFilm;
        }
    }

    public void addLast(int id, String judul, double rating) {
        Nfilm newFilm = new Nfilm(id, judul, rating);
        if (isEmpty()) {
            head = tail = newFilm;
        } else {
            tail.next = newFilm;
            newFilm.prev = tail;
            tail = newFilm;
        }
    }

    public void addAtIndex(int index, int id, String judul, double rating) {
        if (isEmpty()) {
            addFirst(id, judul, rating);
            return;
        }

        Nfilm newFilm = new Nfilm(id, judul, rating);
        Nfilm current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current != null) {
                current = current.next;
            } else {
                throw new IndexOutOfBoundsException("Nilai indeks diluar batas");
            }
        }
        if (current == null || current.next == null) {
            addLast(id, judul, rating);
        } else {
            newFilm.next = current.next;
            newFilm.prev = current;
            current.next.prev = newFilm;
            current.next = newFilm;
        }
    }

    public void removeFirst ()  throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if (size ==1) {
            removeLast();
        }else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast () throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size --;
            return;
        } 
        Nfilm current = head;
        while (current.next.next != null) {
            current= current.next;
        }
        current.next = null;
        size--;
        }

        public void remove (int index) throws Exception {
            if (isEmpty() || index >= size){
                throw new Exception("Nilai indeks diluar batas");
            } else if (index ==0) {
                removeFirst();
            } else {
                Nfilm current = head;
                int i =0;
                while (i<index){
                    current = current.next;
                    i++;
                }
                if (current.next == null) {
                    current.prev.next = null ;
                } else if (current.prev == null) {
                    current = current.next;
                    current.prev = null;
                    head = current;
                } else {
                    current.prev.next = current.next;
                    current.next.prev=current.prev;
                }
                size --;
            }
        }
    

    public void printList() {
        Nfilm current = head;
        while (current != null) {
            System.out.println("ID: " + current.id );
            System.out.println("Judul Film: " + current.judul);
            System.out.println("Rating: " + current.rating);
            current = current.next;
        }
    }

    public void searchById(int id) {
        Nfilm current = head;
        int position = 0;
        while (current != null) {
            if (current.id == id) {
                System.out.println("Data ID Film: " + current.id + " ditemukan di node " + position);
                System.out.println("IDENTITAS FILM");
                System.out.println("ID: " + current.id );
                System.out.println("Judul: " + current.judul );
                System.out.println("Rating: " + current.rating);
                return;
            }
            current = current.next;
            position++;
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
    }

    public void sortByRatingDescending() {
        if (head == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Nfilm current = head;

            while (current.next != null) {
                if (current.rating < current.next.rating) {
                    double tempRating = current.rating;
                    int tempId = current.id;
                    String tempJudul = current.judul;

                    current.rating = current.next.rating;
                    current.id = current.next.id;
                    current.judul = current.next.judul;

                    current.next.rating = tempRating;
                    current.next.id = tempId;
                    current.next.judul = tempJudul;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}