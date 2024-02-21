package Jobsheet2;

public class Buku04 {
    String Judul, Pengarang;
    int halaman, stok, harga;

    public Buku04 ( String jud, String pg, int hal, int stok, int har) {
        Judul = jud;
        Pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    public Buku04 (){
        
    }

    void tampilInformasi() {
        System.out.println("Judul: " + Judul);
        System.out.println("Pengarang: " + Pengarang);
        System.out.println("Jumlah halaman: " +halaman);
        System.out.println("Sisa stok: " +stok);
        System.out.println("Harga: Rp " +harga);
    }
   
    void terjual(int jml){
        if ( stok > 0 && stok >= jml ){
            stok -= jml;
        }else {
            System.out.println("Stok habis");
         }
        }
        
        void restock (int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }
}