package Jobsheet5;
public class mainHotel {
    public static void main(String[] args) {
    sortingHotel list = new sortingHotel();
        
        Hotel h1 = new Hotel("Savanna", "Malang", 500000, (byte)4);
        Hotel h2 = new Hotel("Atria", "surabaya", 450000, (byte)5);
        Hotel h3 = new Hotel("Swiss Bellin", "Jakarta", 800000, (byte)3);
        Hotel h4 = new Hotel("Grand Cakra", "Bandung", 650000, (byte)2);
        Hotel h5 = new Hotel("Santika", "Bogor", 400000, (byte)1);

        list.tambahHotel(h1);
        list.tambahHotel(h2);
        list.tambahHotel(h3);
        list.tambahHotel(h4); 
        list.tambahHotel(h5);

    System.out.println("Data Harga Hotel sebelum sorting:");
    list.tampil();

    System.out.println("Daftar Hotel Berdasarkan Bintang");
    System.out.println("--------------------------------");
    System.out.println("Metode Bubble Sort");
    System.out.println("--------------------------------");
    list.bubbleSortrate();
    list.tampil();
    System.out.println("Metode Selection Sort");
    System.out.println("--------------------------------");
    list.selectionSortrate();;
    list.tampil();
    
    System.out.println("Daftar Hotel Berdasarkan Harga");
    System.out.println("--------------------------------");
    System.out.println("Metode Bubble Sort");
    System.out.println("--------------------------------");
    list.bubbleSortharga();
    list.tampil();
    System.out.println("Metode Selection Sort");
    System.out.println("--------------------------------");
    list.selectionSortharga();
    list.tampil();

    }
}