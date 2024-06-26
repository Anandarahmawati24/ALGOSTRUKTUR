package Jobsheet16;

class TMataKuliah4 {
    String kode;
    String namaMK;
    int sks;

    public TMataKuliah4(String kode, String namaMK, int sks) {
        this.kode = kode;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    @Override
    public String toString() {
        return "MataKuliah{" + "kode='" + kode + '\'' + ", namaMK='" + namaMK + '\'' + ", sks=" + sks + '}';
    }
}