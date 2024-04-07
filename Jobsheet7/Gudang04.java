package Jobsheet7;

public class Gudang04 {
    Barang04[] tumpukan;
    int size;
    int top;

    public Gudang04 (int kapasitas){
        size= kapasitas;
        tumpukan = new Barang04[size];
        top = -1;

    }
    public boolean cekKosong(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    public boolean cekPenuh() {
        if (top == size-1){
            return true;
        }else {
            return false;
        }
    }
    public void tambahBarang(Barang04 brg ){
        if (!cekPenuh()){
            top ++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }
    public Barang04 ambilBarang(){
        if (!cekKosong()){
            Barang04 delete = tumpukan[top];
            top --;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    public Barang04 lihatBarangTeratas () {
        if (!cekKosong()) {
            Barang04 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    public void tampilBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            // for (int i = top; i >= 0; i--){
                for (int i =0; i <= top; i++) {
                    System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, 
                    tumpukan[i].Kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }
    public String konversiDesimalKeBiner(int kode) {
        StackKonversi04 stack = new StackKonversi04 ();
        while (kode >0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode /2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
    public Barang04 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang04 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    public Barang04 cariBarangByKode(int kode) {
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].kode == kode) {
                    System.out.println("Barang ditemukan: " + tumpukan[i].nama);
                    return tumpukan[i];
                }
            }
            System.out.println("Barang dengan kode '" + kode + "' tidak ditemukan.");
            return null;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    
    public Barang04 cariBarangByNama(String nama) {
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].nama.equalsIgnoreCase(nama)) {
                    System.out.println("Barang ditemukan: " + tumpukan[i].nama);
                    return tumpukan[i];
                }
            }
            System.out.println("Barang dengan nama '" + nama + "' tidak ditemukan.");
            return null;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    }