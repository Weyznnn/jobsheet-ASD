import java.util.Scanner;

public class Tugas1 {
    static void cariKota(char kota[][], char kode[], char input, boolean found) {
        for (int i = 0; i < kode.length; i++) {
            if (input == kode[i]) {
                System.out.print("Kota asal kendaraan dengan kode plat nomor " + input + " adalah ");
                for (int j = 0; j < kota[i].length; j++) {
                    System.out.print(kota[i][j]);
                }
                System.out.println();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Kode plat nomor kendaraan tidak ditemukan");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;

        char kode[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char kota[][] = {{'B', 'A', 'N', 'T', 'E', 'N'},
                 {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
                 {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
                 {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
                 {'B', 'O', 'G', 'O', 'R'},
                 {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
                 {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
                 {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
                 {'M', 'A', 'L', 'A', 'N', 'G'},
                 {'T', 'E', 'G', 'A', 'L'}};
        for (int i = 0; i < kode.length; i++) {
            System.out.print(kode[i]+" ");
        }
        System.out.println();
        System.out.print("Masukkan kode plat nomor kendaraan: ");
        char input = sc.nextLine().toUpperCase().charAt(0);
        cariKota(kota, kode, input, found);
        sc.close();
    }
}