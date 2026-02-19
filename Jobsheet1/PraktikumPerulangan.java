import java.util.Scanner;

public class PraktikumPerulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nim, digitAkhir;
        int n;

        System.out.print("Masukkan NIM Anda: ");
        nim = sc.nextLine();
        sc.close();
        digitAkhir = nim.substring(nim.length() - 2);
        n = Integer.parseInt(digitAkhir);
        if (n < 10) {
            n+=10;
        }

        for (int i = 1; i <= n; i++) {
            if (i==10 || i==15) {
                continue;
            } else if (i%3==0) {
                System.out.print("#");
            } else if (i%2==0) {
                System.out.print(i);
            } else {
                System.out.print("*");
            }
        }
    }
}