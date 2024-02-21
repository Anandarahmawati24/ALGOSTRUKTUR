import java.util.Scanner;
public class Perulangan04{
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        System.out.print(" Masukkan NIM: ");
        String NIM =input04.nextLine();
        int n = NIM.charAt(NIM.length() - 1) - '0';
        
                if (n < 10) {
                    n += 10;
                }
            System.out.println("n : " + n);
        
                for (int i = 2; i <= n; i++) {
                    if (i == 6 || i == 10) continue;
                    if (i % 2 == 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print(i + " ");
                    }
                }
        }
    } 