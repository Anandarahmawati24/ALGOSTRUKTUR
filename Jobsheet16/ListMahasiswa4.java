package Jobsheet16;
import java.util.ArrayList;
import java.util.Arrays;
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

int LinearSearch(String nim) {
    for (int i=0; i < mahasiswas.size(); i++) {
        if (nim.equals(mahasiswas.get(i).nim)) {
            return i;
        }
    }
    return -1;
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
    lm.update(lm.LinearSearch("201235"), new Mahasiswa4("201235", "Akhleema Lela", "021xx2"));
    System.out.println("");
    lm.tampil();
}
}