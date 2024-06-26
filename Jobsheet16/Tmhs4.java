package Jobsheet16;

class Tmhs4 {
    String nim;
    String nama;
    String noTelp;

    public Tmhs4(String nim, String nama, String noTelp) {
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim='" + nim + '\''+ ", nama='" + nama + '\'' + ", noTelp='" + noTelp + '\'' +'}';
    }
}
