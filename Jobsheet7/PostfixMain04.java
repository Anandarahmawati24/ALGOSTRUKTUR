package Jobsheet7;
import java.util.Scanner;

public class PostfixMain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p, Q;
        System.out.println("Masukkkan ekspresi mateatika (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        Postfix04 post = new Postfix04(total);
        p = post.konversi(Q);
        System.out.println("Postfix: " + p);
    }
}