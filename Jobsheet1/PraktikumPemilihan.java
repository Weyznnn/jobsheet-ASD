import java.util.Scanner;

public class PraktikumPemilihan {
    static boolean verivNilai(int nilai, boolean valid) {
        if (valid) {
            return true;
        }
        if (nilai < 0 || nilai > 100) {
            return true; 
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        boolean validation = false;
        
        do {
            validation = false;
            System.out.println("Program Menghitung Nilai Akhir");
            System.out.println("===============================");
            System.out.print("Masukkan Nilai Tugas: ");
            nilaiTugas = sc.nextInt();
            validation = verivNilai(nilaiTugas, validation);
            System.out.print("Masukkan Nilai Kuis: ");
            nilaiKuis = sc.nextInt();
            validation = verivNilai(nilaiKuis, validation);
            System.out.print("Masukkan Nilai UTS: ");
            nilaiUTS = sc.nextInt();
            validation = verivNilai(nilaiUTS, validation);
            System.out.print("Masukkan Nilai UAS: ");
            nilaiUAS = sc.nextInt();
            validation = verivNilai(nilaiUAS, validation);
            System.out.println("===============================");
            System.out.println("===============================");
            
            if (validation) {
                System.out.println("nilai tidak valid");
                System.out.println("===============================");
                System.out.println("===============================");
            }
        } while (validation);
        sc.close();
        
        double nilaiAkhir = (nilaiTugas*0.2)+(nilaiKuis*0.2)+(nilaiUTS*0.3)+(nilaiUAS*0.3);
        System.out.printf("Nilai akhir : %.2f\n", nilaiAkhir);
        
        if (nilaiAkhir > 80) {
            System.out.println("Nilai huruf : A");
        } else if (nilaiAkhir > 73) {
            System.out.println("Nilai huruf : B+");
        } else if (nilaiAkhir > 65) {
            System.out.println("Nilai huruf : B");
        } else if (nilaiAkhir > 60) {
            System.out.println("Nilai huruf : C+");
        } else if (nilaiAkhir > 50) {
            System.out.println("Nilai huruf : C");
        } else if (nilaiAkhir > 39) {
            System.out.println("Nilai huruf : D");
        } else {
            System.out.println("Nilai huruf : E");
        }
        System.out.println("===============================");
        System.out.println("===============================");

        if (nilaiAkhir > 50) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("ANDA BELUM LULUS");
        }
    }
}
