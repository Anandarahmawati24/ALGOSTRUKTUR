package Jobsheet16;

import java.util.*;

public class TMain4 {
    List<Tmhs4> mahasiswaList = new ArrayList<>();
    List<TMataKuliah4> mataKuliahList = new ArrayList<>();
    List<TNilai4> nilaiList = new ArrayList<>();
    Queue<Tmhs4> mahasiswaQueue = new LinkedList<>();

    public void tambahMahasiswa(Tmhs4 mhs) {
        mahasiswaList.add(mhs);
        mahasiswaQueue.offer(mhs); // tambahkan mahasiswa ke dalam Queue
    }

    public void tambahMataKuliah(TMataKuliah4 mk) {
        mataKuliahList.add(mk);
    }

    public void tambahNilai(TNilai4 nilai) {
        nilaiList.add(nilai);
    }

    public void tampilNilai() {
        System.out.println("=========================================================================================================");
        System.out.printf("%-10s | %-25s | %-30s | %-5s | %-5s\n", "NIM", "Nama Mahasiswa", "Mata Kuliah", "SKS", "Nilai");
        System.out.println("=========================================================================================================");
        for (TNilai4 nilai : nilaiList) {
            System.out.printf("%-10s | %-25s | %-30s | %-5d | %-5.1f\n", nilai.mahasiswa.nim, nilai.mahasiswa.nama,
                    nilai.mataKuliah.namaMK, nilai.mataKuliah.sks, nilai.nilai);
        }
        System.out.println("=========================================================================================================");
    }

    public Tmhs4 cariMahasiswa(String nim) {
        for (Tmhs4 mhs : mahasiswaList) {
            if (mhs.nim.equals(nim)) {
                return mhs;
            }
        }
        return null;
    }

    public TMataKuliah4 cariMataKuliah(String kodeMK) {
        for (TMataKuliah4 mk : mataKuliahList) {
            if (mk.kode.equals(kodeMK)) {
                return mk;
            }
        }
        return null;
    }

    public TNilai4 cariNilai(String nim) {
        for (TNilai4 nilai : nilaiList) {
            if (nilai.mahasiswa.nim.equals(nim)) {
                return nilai;
            }
        }
        return null;
    }

    public void urutkanNilaiDescending() {
        nilaiList.sort((n1, n2) -> Double.compare(n2.nilai, n1.nilai));
    }

    public void hapusMahasiswa() {
        Tmhs4 removedMahasiswa = mahasiswaQueue.poll(); // hapus dari depan Queue
        if (removedMahasiswa != null) {
            System.out.println("Mahasiswa dengan NIM " + removedMahasiswa.nim + " telah dihapus dari daftar.");
    
            // Hapus dari mahasiswaList
            mahasiswaList.removeIf(mhs -> mhs.nim.equals(removedMahasiswa.nim));
    
            // Hapus dari nilaiList jika ada
            nilaiList.removeIf(nilai -> nilai.mahasiswa.nim.equals(removedMahasiswa.nim));
        } else {
            System.out.println("Tidak ada mahasiswa yang bisa dihapus.");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TMain4 main = new TMain4();
        int pilihan;

        // Contoh data awal (mata kuliah dulu, baru mahasiswa)
        main.tambahMataKuliah(new TMataKuliah4("00001", "Internet of Things", 3));
        main.tambahMataKuliah(new TMataKuliah4("00002", "Algoritma dan Struktur Data", 2));
        main.tambahMataKuliah(new TMataKuliah4("00003", "Algoritma dan Pemrograman", 2));
        main.tambahMataKuliah(new TMataKuliah4("00004", "Praktikum Algoritma dan Struktur Data", 3));
        main.tambahMataKuliah(new TMataKuliah4("00005", "Praktikum Algoritma dan Pemrograman", 3));

        // Tambahkan data mahasiswa
        main.tambahMahasiswa(new Tmhs4("20001", "Thalhah", "021xxx"));
        main.tambahMahasiswa(new Tmhs4("20002", "Zubair", "021xxx"));
        main.tambahMahasiswa(new Tmhs4("20003", "Abdur-Rahman", "021xxx"));
        main.tambahMahasiswa(new Tmhs4("20004", "Sa'ad", "021xxx"));
        main.tambahMahasiswa(new Tmhs4("20005", "Sa'id", "021xxx"));
        main.tambahMahasiswa(new Tmhs4("20006", "Ubaidah", "021xxx"));

        do {
            System.out.println("***********************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***********************************************");
            System.out.println("");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampilkan Nilai");
            System.out.println("3. Cari Nilai Mahasiswa");
            System.out.println("4. Urutkan Nilai Descending");
            System.out.println("5. Hapus Data Mahasiswa");
            System.out.println("6. Keluar");
            System.out.println("***********************************************");
            System.out.print("Pilih : ");
            pilihan = sc.nextInt();
            sc.nextLine(); // untuk mengonsumsi newline setelah nextInt()

            switch (pilihan) {
                case 1:
                    // Input Nilai
                    System.out.println("Masukkan data nilai:");

                    // Tampilkan daftar mata kuliah
                    System.out.println("\nDaftar Mata Kuliah:");
                    main.tampilMataKuliah();
                    System.out.print("Masukkan Kode Mata Kuliah: ");
                    String kodeMK = sc.nextLine();
                    TMataKuliah4 mataKuliah = main.cariMataKuliah(kodeMK);
                    if (mataKuliah == null) {
                        System.out.println("Mata kuliah dengan kode " + kodeMK + " tidak ditemukan.");
                        break;
                    }

                    // Tampilkan daftar mahasiswa
                    System.out.println("\nDaftar Mahasiswa:");
                    main.tampilMahasiswa();
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = sc.nextLine();
                    Tmhs4 mahasiswa = main.cariMahasiswa(nim);
                    if (mahasiswa == null) {
                        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                        break;
                    }

                    // Memasukkan nilai
                    System.out.print("Masukkan Nilai: ");
                    double nilaiInput = sc.nextDouble();
                    sc.nextLine(); // untuk mengonsumsi newline setelah nextDouble()
                    main.tambahNilai(new TNilai4(mahasiswa, mataKuliah, nilaiInput));
                    System.out.println("Nilai berhasil ditambahkan untuk mahasiswa dengan NIM " + nim + ".");
                    break;
                case 2:
                    // Tampilkan Nilai
                    main.tampilNilai();
                    break;
                case 3:
                    // Cari Nilai Mahasiswa
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nimCari = sc.nextLine();
                    TNilai4 nilaiMahasiswa = main.cariNilai(nimCari);
                    if (nilaiMahasiswa != null) {
                        System.out.println("Nilai Mahasiswa:");
                        System.out.printf("%-10s | %-25s | %-30s | %-5s | %-5s\n", "NIM", "Nama Mahasiswa", "Mata Kuliah", "SKS", "Nilai");
                        System.out.println("---------------------------------------------------------------------------------------------------------");
                        System.out.printf("%-10s | %-25s | %-30s | %-5d | %-5.1f\n", nilaiMahasiswa.mahasiswa.nim, nilaiMahasiswa.mahasiswa.nama,
                                nilaiMahasiswa.mataKuliah.namaMK, nilaiMahasiswa.mataKuliah.sks, nilaiMahasiswa.nilai);
                    } else {
                        System.out.println("Nilai untuk mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                    }
                    break;
                case 4:
                    // Urutkan Nilai Descending
                    main.urutkanNilaiDescending();
                    System.out.println("Daftar Nilai setelah diurutkan (Descending):");
                    main.tampilNilai();
                    break;
                case 5:
                    // Hapus Data Mahasiswa
                    main.hapusMahasiswa();
                    break;
                case 6:
                    // Keluar
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 6);

        sc.close();
    }

    private void tampilMahasiswa() {
        System.out.println("===============================================================================");
        System.out.printf("%-10s | %-25s | %-10s\n", "NIM", "Nama Mahasiswa", "No Telp");
        System.out.println("===============================================================================");
        for (Tmhs4 mhs : mahasiswaList) {
            System.out.printf("%-10s | %-25s | %-10s\n", mhs.nim, mhs.nama, mhs.noTelp);
        }
        System.out.println("===============================================================================");
    }

    private void tampilMataKuliah() {
        System.out.println("=========================================================");
        System.out.printf("%-10s | %-30s | %-5s\n", "Kode MK", "Nama Mata Kuliah", "SKS");
        System.out.println("=========================================================");
        for (TMataKuliah4 mk : mataKuliahList) {
            System.out.printf("%-10s | %-30s | %-5d\n", mk.kode, mk.namaMK, mk.sks);
        }
        System.out.println("=========================================================");
    }
}