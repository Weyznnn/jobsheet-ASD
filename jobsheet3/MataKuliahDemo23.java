package jobsheet3;

import java.util.Scanner;

public class MataKuliahDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatakKuliah23[] arrayOfMatakuliah = new MatakKuliah23[3];
        String kode, nama, dummy;
        int sks, jumlahJam, jumlahMatakuliah;

        System.out.print("Masukkan jumlah matakuliah: ");
        jumlahMatakuliah = Integer.parseInt(sc.nextLine());
        arrayOfMatakuliah = new MatakKuliah23[jumlahMatakuliah];

        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Masukkan data matakuliah ke-" + (i + 1));
            System.out.print("Kode: ");
            kode = sc.nextLine();
            System.out.print("Nama: ");
            nama = sc.nextLine();
            System.out.print("SKS: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfMatakuliah[i] = new MatakKuliah23(kode, nama, sks, jumlahJam);
        }

        do {
            System.out.print("Apakah ingin menambah data matakuliah? (y/n): ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("n")) {
                break;
            }
            System.out.print("Masukkan indeks matakuliah yang ingin ditambah data: ");
            int index = Integer.parseInt(sc.nextLine());
            if (index >= 0 && index < jumlahMatakuliah) {
                System.out.print("Masukkan SKS baru: ");
                int sksBaru = Integer.parseInt(sc.nextLine());
                System.out.print("Masukkan jumlah jam baru: ");
                int jumlahJamBaru = Integer.parseInt(sc.nextLine());
                arrayOfMatakuliah[index].tambahData(sksBaru, jumlahJamBaru);
            } else {
                System.out.println("Indeks tidak valid.");
            }
        } while (true);

        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("Data matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
            System.out.println("------------------------------");
        }
        sc.close();
    }
}
