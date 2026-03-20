package minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = input.nextInt();

        Sum sm = new Sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + " : ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan brute force : " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan divide and conquer : " + sm.totalDC(sm.keuntungan, 0, elemen - 1));
        input.close();
    }
}
