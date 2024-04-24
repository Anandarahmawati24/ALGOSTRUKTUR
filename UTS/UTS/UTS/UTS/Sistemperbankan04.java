package UTS.UTS;
public class Sistemperbankan04 {
    perbankan04 [] rekening;
    int jumRekening;
    int size;

    public Sistemperbankan04(int kapasitas) {
        size= kapasitas;
        rekening = new perbankan04[size];
        jumRekening = 0;
    }
// method tambah rekening
 public void tambahRekening(int nomorRekening, String nama, String nomorTelepon, String email, double saldo) {
    if (jumRekening < rekening.length) {
        rekening[jumRekening++] = new perbankan04(nomorRekening, nama, nomorTelepon, email, saldo);
    } else {
        System.out.println("Kapasitas rekening penuh.");
    }
}
// method menampilkan semua rekening
public void tampilSemuaRekening() {
    if (jumRekening == 0) {
        System.out.println("Tidak ada data rekening.");
        return;
    }
    System.out.println("Data Seluruh Rekening:");
    for (int i = 0; i < jumRekening; i++) {
        System.out.println(rekening[i].getNoRekening() + "\t\t" + rekening[i].getNama() + "\t\t" +
                rekening[i].getNoTelepon() + "\t\t" + rekening[i].getEmail() + "\t\t" + rekening[i].getSaldo());
            }
        }
        // method menampilkan rekening dari saldo paling kecil menggunakan algoritma bubble short
public void BubbleShortRekMenurun() {
    if (jumRekening == 0) {
        System.out.println("Tidak ada data rekening.");
        return;
    }
    for (int i = 0; i < jumRekening - 1; i++) {
        for (int j = 0; j < jumRekening - i - 1; j++) {
            if (rekening[j].getSaldo() < rekening[j + 1].getSaldo()){
                perbankan04 temp = rekening[j];
                rekening[j] = rekening[j + 1];
                rekening[j + 1] = temp;
            }
        }
    }
    System.out.println("Data Rekening Diurutkan berdasarkan Saldo (Menurun):");
    tampilSemuaRekening();
}
// method untuk menampilkan rekening dengan saldo di bawah 50.000
public void tampilRekeningunder50000() {
    if (jumRekening == 0) {
        System.out.println("Tidak ada data rekening.");
        return;
    }
    System.out.println("Data Rekening dengan Saldo Kurang dari 50000:");
    for (int i = 0; i < jumRekening; i++) {
        if (rekening[i].getSaldo() < 50000) {
            System.out.println(rekening[i].getNoRekening() + "\t" + rekening[i].getNama() + "\t" +
                    rekening[i].getNoTelepon() + "\t" + rekening[i].getEmail() + "\t" + rekening[i].getSaldo());
        }
    }
}
// method untuk mencari rekening berdasarkan nama
public void cariRekeningBerdasarkanNama(String key) {
    if (jumRekening == 0) {
        System.out.println("Tidak ada data rekening.");
        return;
    }
    System.out.println("Hasil Pencarian:");
    for (int i = 0; i < jumRekening; i++) {
        if (rekening[i].getNama().toLowerCase().contains(key.toLowerCase())) {
            System.out.println(rekening[i].getNoRekening() + "\t" + rekening[i].getNama() + "\t" +
                    rekening[i].getNoTelepon() + "\t" + rekening[i].getEmail() + "\t" + rekening[i].getSaldo());
        }
    }
}
// method untuk menarik saldo dari rekening
public boolean tarikSaldoDariRekening(int nomorRekening, double jumlah) {
    if (jumRekening == 0) {
        System.out.println("Tidak ada data rekening.");
        return false;
    }
    boolean found = false;
    for (int i = 0; i < jumRekening; i++) {
        if (rekening[i].getNoRekening() == nomorRekening) {
            found = true;
            if (rekening[i].tarik(jumlah)) {
                System.out.println("Penarikan berhasil.");
            } else {
                System.out.println("Penarikan gagal karena saldo tidak mencukupi.");
            }
            break;
        }
    }
    if (!found) {
        System.out.println("Rekening tidak ditemukan.");
    }
    return found;
}
// method untuk setor tunai ke rekening
public void setorKeRekening(int nomorRekening, double jumlah) {
    if (jumRekening == 0) {
        System.out.println("Tidak ada data rekening.");
        return;
    }
    boolean found = false;
    for (int i = 0; i < jumRekening; i++) {
        if (rekening[i].getNoRekening() == nomorRekening) {
            found = true;
            rekening[i].setor(jumlah);
            break;
        }
    }
    if (!found) {
        System.out.println("Rekening tidak ditemukan.");
    }
}
}