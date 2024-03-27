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

    public void Tampilposisi(int x, int pos) {
        if (pos!= -1){
            System.out.println("data :" + x + "ditemukan pada indeks " +pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

}