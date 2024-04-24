package UTS.UTS;
public class perbankan04 {
    int NoRekening;
    String nama;
    String NoTelepon;
    String email;
    double saldo;

    public perbankan04 (int NoRekening, String nama, String NoTelepon, String email, double saldo){
        this.NoRekening=NoRekening;
        this.nama= nama;
        this.NoTelepon= NoTelepon;
        this.email=email;
        this.saldo=saldo;
    }
    // method untuk menyimpan no rekening
    public int getNoRekening() {
        return NoRekening;
    }
    // method untuk menyimpan nama nasabah
    public String getNama() {
        return nama;
    }
    // method untuk menyimpan nomor telepon nasabah
    public String getNoTelepon() {
        return NoTelepon;
    }
    // method untuk menyimpan email nasabah
    public String getEmail() {
        return email;
    }
    //method untuk menyinpam saldo nasabah
    public double getSaldo() {
        return saldo;
    }
    // method untuk menyimpan jumlah saldo nasabah
    public void setSaldo(double jumlah) {
        saldo = jumlah;
    }
    // method untuk tarik uang dari rekening nasabah
    public boolean tarik(double jumlah) {
        if (jumlah > saldo)
            return false;
        saldo -= jumlah;
        return true;
    }
    // method untuk setor tunai ke rekening nasabah
    public void setor(double jumlah) {
        saldo += jumlah;
    }
}