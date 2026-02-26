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
        sc.close();

        DataDosen23.dataSemuaDosen(arrayOfDosen);
        DataDosen23.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen23.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen23.infoDosenPalingTua(arrayOfDosen);
        DataDosen23.infoDosenPalingMuda(arrayOfDosen);
        
    }
}