package Jobsheet4;
public class Sum {
    String nama;
    private double[] keuntunganBulanan;
    public Sum(String nama, int jumlahBulan) {
        this.nama = nama;
        this.keuntunganBulanan = new double[jumlahBulan];
    }
    public void KeuntunganBulanan(int bulan, double keuntungan) {
        keuntunganBulanan[bulan - 1] = keuntungan;
    }
    public double hitungTotalKeuntungan() {
        double total = 0;
        for (double keuntungan : keuntunganBulanan) {
            total += keuntungan;
        }
        return total;
    }
    public double hitungTotalKeuntunganBruteForce() {
        double total = 0;
        for (double keuntungan : keuntunganBulanan) {
            total += keuntungan;
        }
        return total;
    }
    public double hitungTotalKeuntunganDivideConquer() {
        return hitungTotalKeuntunganDivideConquer(keuntunganBulanan, 0, keuntunganBulanan.length - 1);
    }
    private double hitungTotalKeuntunganDivideConquer(double[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = hitungTotalKeuntunganDivideConquer(arr, l, mid - 1);
            double rsum = hitungTotalKeuntunganDivideConquer(arr, mid + 1, r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }
}