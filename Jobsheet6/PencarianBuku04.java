public class PencarianBuku04 {
    Buku04 listBK [] = new Buku04 [5];
    int idx;
    
    void tambah(Buku04 m) {
        if (idx < listBK.length) {
            listBK[idx] = m;
            idx ++;
        }else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil () {
        for (Buku04 m : listBK ) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(String cari ) {
        int posisi = -1;
        for (int j=0; j< listBK.length; j++) {
            if (listBK[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public Buku04 FindBuku(String cari){
        for (Buku04 buku : listBK) {
            if (buku.kodeBuku.equals(cari)) {
                return buku;
            }
        }
        return null;
    }

    public void Tampilposisi(String x, int pos) {
        if (pos!= -1){
            System.out.println("data : "  + x +  " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(String x, int pos){
        if (pos!= -1){
            System.out.println("Kode Buku \t : " + x);
            System.out.println("Judul     \t : " +listBK[pos].judulBuku);
            System.out.println("Tahun Terbit \t : " +listBK[pos].tahunTerbit);
            System.out.println("Pengarang \t : " +listBK[pos].pengarang);
            System.out.println("Stock     \t : " +listBK[pos].stock);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    public int FindBinarySearch(String cari, int left, int right) {
        while (left <= right) {
            int mid = left +(right - left) / 2;
            if (cari.equals(listBK[mid].kodeBuku)) {
                return mid;
            } else if (cari.compareTo(listBK[mid].kodeBuku) < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}