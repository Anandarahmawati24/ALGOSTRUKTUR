package Jobsheet16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa4 {
    List<Mahasiswa4> mahasiswas = new ArrayList<>();
public void tambah(Mahasiswa4... mahasiswa){
    mahasiswas.addAll(Arrays.asList(mahasiswa));
}

public void hapus (int index) {
    mahasiswas.remove(index);
}

public void update(int index, Mahasiswa4 mhs) {
    mahasiswas.set(index, mhs);
}

public void tampil() {
    mahasiswas.stream().forEach(mhs -> {
        System.out.println("" + mhs.toString());
    });
}
void sortByNimAscending() {
    Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
}

int binarySearch(String nim) {
    sortByNimAscending();
    int index = Collections.binarySearch(mahasiswas, new Mahasiswa4(nim, null, null), Comparator.comparing(m -> m.nim));
    return index >= 0 ? index : -1;
}

// Sort ascending berdasarkan NIM
void sortAscending() {
    Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
}

// Sort descending berdasarkan NIM
void sortDescending() {
    Collections.sort(mahasiswas, (m1, m2) -> m2.nim.compareTo(m1.nim));
}

public static void main(String[] args) {
    ListMahasiswa4 lm = new ListMahasiswa4();
    Mahasiswa4 m= new Mahasiswa4("201234", "Noureen", "021xx1" );
    Mahasiswa4 m1= new Mahasiswa4("201235", "Akhleema", "021xx2" );
    Mahasiswa4 m2= new Mahasiswa4("201236", "Shannum", "021xx3" );
    //menambakan objek mahasiswa
    lm.tambah(m,m1,m2);
    //menampilkan list mahasiswa 
    lm.tampil();
    //update mahasiswa
    lm.update(lm.binarySearch("201235"), new Mahasiswa4("201235", "Akhleema Lela", "021xx2"));
    System.out.println("");
    lm.tampil();

    // Sorting ascending
    System.out.println("");
    System.out.println("Sorting ascending:");
    lm.sortAscending();
    lm.tampil();

    // Sorting descending
    System.out.println("");
    System.out.println("Sorting descending:");
    lm.sortDescending();
    lm.tampil();
}
}