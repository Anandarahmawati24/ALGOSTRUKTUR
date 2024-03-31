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

    public int FindSeqSearch(int cari ) {
        int posisi = -1;
        for (int j=0; j< listBK.length; j++) {
            if (listBK[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public Buku04 FindBuku(int cari){
        for (Buku04 buku : listBK) {
            if (buku.kodeBuku == cari) {
                return buku;
            }
        }
        return null;
    }

    public void Tampilposisi(int x, int pos) {
        if (pos!= -1){
            System.out.println("data : "  + x +  " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos){
        if (pos!= -1){
            System.out.println("Kode Buku \t : " + x);
            System.out.println("Judul     \t : " +listBK[pos].judulBuku);
            System.out.println("Tahun Terbit \t : " +listBK[pos].tahunTerbit);
            System.out.println("Pengarang \t : " +listBK[pos].pengarang);
            System.out.println("Stock     \t : " +listBK[pos].stock);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = left+ (right - left)/2;
            if (cari == listBK[mid].kodeBuku) {
                return (mid);
            } else if (listBK[mid].kodeBuku < cari) {
                return FindBinarySearch(cari, left, mid-1);
            }else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}