package jobsheet3;

import java.util.Scanner;

public class DosenDemo23 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        Dosen23[] arrayOfDosen = new Dosen23[3];

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("kode: ");
            String kode = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Laki/Wanita): ");
            String jenisKelaminString = sc.nextLine();
            boolean jenisKelamin = jenisKelaminString.equalsIgnoreCase("Laki");
            System.out.print("Usia: ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("-----------------------------");
            
            arrayOfDosen[i] = new Dosen23(kode, nama, jenisKelamin, usia);
        }
        for (Dosen23 dosen23 : arrayOfDosen) {
            int i = 0;
            System.out.println("Data Dosen: ke-" + (i + 1));
            System.out.println("Kode: " + dosen23.kode);
            System.out.println("Nama: " + dosen23.nama);
            System.out.println("Jenis Kelamin: " + (dosen23.jenisKelamin ? "Laki-laki" : "Wanita"));
            System.out.println("Usia: " + dosen23.usia);
            System.out.println("-----------------------------");
            i++;
        }
        sc.close();
    }
}