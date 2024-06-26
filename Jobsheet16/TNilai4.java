package Jobsheet16;

class TNilai4 {
    Tmhs4 mahasiswa;
    TMataKuliah4 mataKuliah;
    double nilai;

    public TNilai4(Tmhs4 mahasiswa, TMataKuliah4 mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return "Nilai{" + "mahasiswa=" + mahasiswa.nama + ", mataKuliah=" + mataKuliah.namaMK + ", sks=" + mataKuliah.sks +  ", nilai=" + nilai +'}';
    }
}
