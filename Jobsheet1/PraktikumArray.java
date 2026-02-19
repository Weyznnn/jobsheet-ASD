import java.util.Scanner;

public class PraktikumArray {
    static Scanner sc = new Scanner(System.in);
    static double nilaiMhs[][] = new double[8][2];
    static String bobotNilai[] = new String[8];
    static double sks[] = {2, 2, 4, 2, 4, 2, 4, 6};
    static String namaMK[] = {"Pancasila", "Konsep Teknologi Informatika", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Dasar Pemrograman", "Bahasa Inggris", "Kesehatan dan Keselamatan Kerja", "Praktikum Dasar Pemrograman"};
    
    static boolean isNilaiValid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    static void tampilanInput() {
        System.out.println("===============================");
        System.out.println("Program menghitung IP semester");
        System.out.println("===============================");
        boolean inputValid = false;
        
        while (!inputValid) {
            inputValid = true;
            for (int i = 0; i < namaMK.length; i++) {
                System.out.print("Masukkan nilai angka untuk MK " + namaMK[i] + ": ");
                nilaiMhs[i][0] = sc.nextInt();
                
                if (!isNilaiValid(nilaiMhs[i][0])) {
                    System.out.println("Masukkan nilai antara 0-100!");
                    inputValid = false;
                    break;
                }
            }
        }
    }

    static void konversiNilai() {
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i][0] > 80) {
                bobotNilai[i] = "A";
                nilaiMhs[i][1] = 4;
            } else if (nilaiMhs[i][0] > 73) {
                bobotNilai[i] = "B+";
                nilaiMhs[i][1] = 3.5;
            } else if (nilaiMhs[i][0] > 65) {
                bobotNilai[i] = "B";
                nilaiMhs[i][1] = 3;
            } else if (nilaiMhs[i][0] > 60) {
                bobotNilai[i] = "C+";
                nilaiMhs[i][1] = 2.5;
            } else if (nilaiMhs[i][0] > 50) {
                bobotNilai[i] = "C";
                nilaiMhs[i][1] = 2;
            } else if (nilaiMhs[i][0] > 39) {
                bobotNilai[i] = "D";
                nilaiMhs[i][1] = 1;
            } else {
                bobotNilai[i] = "E";
                nilaiMhs[i][1] = 0;
            }
        }
    }

    static double hitungIPK() {
        double jumlahSKS = 0, totalNilaiMutu = 0;
        
        for (int i = 0; i < sks.length; i++) {
            jumlahSKS += sks[i];
            totalNilaiMutu += sks[i] * nilaiMhs[i][1];
        }
        
        return totalNilaiMutu / jumlahSKS;
    }

    static void tampilkanHasil(double ipk) {
        System.out.println("===============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("===============================");
        System.out.printf("%-45s | %-12s | %-12s | %-12s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("=======================================================================================================");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("%-45s | %-12.0f | %-12s | %-12.1f%n", namaMK[i], nilaiMhs[i][0], bobotNilai[i], nilaiMhs[i][1]);
        }
        System.out.println("=======================================");
        System.out.printf("IPK: %.2f%n", ipk);
    }

    public static void main(String[] args) {
        tampilanInput();
        konversiNilai();
        double ipk = hitungIPK();
        tampilkanHasil(ipk);
    }
}
