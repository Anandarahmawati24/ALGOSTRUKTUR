package Jobsheet16;

import Jobsheet5.Mahasiswa;

public class Mahasiswa4 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa4() {

    }

    public Mahasiswa4(String nim, String nama, String notelp) {
        this.nim=nim;
        this.nama=nama;
        this.notelp=notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
    
}
