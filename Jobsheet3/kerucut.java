package Jobsheet3;

public class kerucut{
    
    double jariJari;
    double sisiMiring;

    public double hitungLuasPermukaan() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * sisiMiring;
}
}