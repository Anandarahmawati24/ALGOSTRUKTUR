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
    public PencarianBuku04() {
        // Inisialisasi array listBK
        for (int i = 0; i < listBK.length; i++) {
            listBK[i] = null;
        }
    }
  
    void tampil () {
        for (Buku04 m : listBK ) {
            m.tampilDataBuku();
        }
    }
    public void BubblesortBuku(){
        for (int i = 0; i < listBK.length - 1; i++) {
            for (int j = 0; j < listBK.length - i - 1; j++) {
                if (listBK[j].kodeBuku.compareTo(listBK[j + 1].kodeBuku) > 0) {
                    Buku04 temp = listBK[j];
                    listBK[j] = listBK[j + 1];
                    listBK[j + 1] = temp;
                }
            }
        }
    }

   // public int FindSeqSearchKodeBuku(String cari) {
       // for (int j = 0; j < listBK.length; j++) {
           // if (listBK[j] != null && listBK[j].kodeBuku.equals(cari)) {
           //     return j;
            //}
        //}
        //return -1;
    //}

    public int FindSeqSearchJudBuk(String cari) {
        for (int j = 0; j < listBK.length; j++) {
            if (listBK[j].judulBuku.equalsIgnoreCase(cari)) {
                return j;
            }
        }
        return -1;
    }

    public Buku04 FindBuku(String cari){
        for (Buku04 buku : listBK) {
            if (buku != null && buku.judulBuku.equals(cari)) {
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
            System.out.println("Kode Buku \t : " + listBK[pos].kodeBuku);
            System.out.println("Judul     \t : " +listBK[pos].judulBuku);
            System.out.println("Tahun Terbit \t : " +listBK[pos].tahunTerbit);
            System.out.println("Pengarang \t : " +listBK[pos].pengarang);
            System.out.println("Stock     \t : " +listBK[pos].stock);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
   // public int FindBinarySearchKodeBuku(String cari) {
       // BubblesortBuku(); 
        //int left = 0;
        //int right = listBK.length - 1;
        //while (left <= right) {
          //  int mid = left + (right - left) / 2;
            //int cmp = cari.compareTo(listBK[mid].kodeBuku);
            //if (cmp == 0) {
               // return mid;
            //}else {
            // Cari di sebelah kiri dan kanan mid
           // int leftCmp = cari.compareToIgnoreCase(listBK[left].judulBuku);
           // int rightCmp = cari.compareToIgnoreCase(listBK[right].judulBuku);
            //if (leftCmp < 0) {
              //  right = mid - 1;
            //} else if (rightCmp > 0) {
              //  left = mid + 1;
            //} else {
                // Jika tidak ada kecocokan di sebelah kiri atau kanan mid,
                // lanjutkan pencarian biner biasa
              //  cmp= cari.compareToIgnoreCase(listBK[mid].judulBuku);
              //  if (cmp == 0) {
                //    while (mid > left && listBK[mid - 1].judulBuku.equalsIgnoreCase(cari)) {
                //        mid--;
                //    }
                  //  return mid;
                //} else if (cmp < 0) {
                  //  right = mid - 1;
               // } else {
                 //   left = mid + 1;
               // }
         //   }
        //}
   // }
   // return -1;
   // }
    public int FindBinarySearchJudBuk(String cari) {
        BubblesortBuku();
        int left =0;
        int right = idx-1;
        while (left <= right) {
            int mid = left +(right - left) / 2;
            int cmp = cari.compareToIgnoreCase(listBK[mid].judulBuku);
            if (cmp == 0) {
                return mid; // Jika ditemukan, kembalikan posisi
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1; // Jika tidak ditemukan, kembalikan -1
    }
    public void cariJudulBuku(String judul) {
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (listBK[i].judulBuku.equalsIgnoreCase(judul)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Judul buku tidak ditemukan.");
        } else if (count == 1) {
            System.out.println("Judul buku ditemukan.");
        } else {
            System.out.println("Peringatan: Terdapat lebih dari satu buku dengan judul tersebut.");
        }
    }
}