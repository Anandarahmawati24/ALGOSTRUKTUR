package Jobsheet4;
public class Pangkat {
    public int nilai, pangkat;

    public Pangkat(int n, int p){
        nilai = n;
        pangkat = p;
    }

    int pangkatBF(int a, int n){
        int pangkat = 1;
        for (int i=1; i<=n; i++){
            pangkat *= a;
        }
        return pangkat;

    }

    int pangkatDC(int a, int n){
        if (n==1)
        return a;
        else{
            if(n%2==0)
            return pangkatDC(a, n/2)*pangkatDC(a, n/2);
            else
            return pangkatDC(a, n/2)*pangkatDC(a, n/2)*a;
        }
    }
}