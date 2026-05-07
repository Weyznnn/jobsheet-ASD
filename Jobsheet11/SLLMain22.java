package Jobsheet11;

import java.util.Scanner;

public class SLLMain22 {
    public static void menuTambahData() {
        System.out.println("Pilih Menu: ");
        System.out.println("1. Tambah Data di Awal");
        System.out.println("2. Tambah Data di Akhir");
        System.out.println("3. Tambah Data Setelah Data Tertentu");
        System.out.println("4. Tambah Data di Index Tertentu");
        System.out.println("0. Keluar");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihUtama, pilihTambah;
        SingleLinkedList22 sll = new SingleLinkedList22();
        // Mahasiswa22 mhs1 = new Mahasiswa22("24212200", "Alvaro", "1A", 4.0);
        // Mahasiswa22 mhs2 = new Mahasiswa22("23212201", "Bimon", "2B", 3.8);
        // Mahasiswa22 mhs3 = new Mahasiswa22("22212202", "Cintia", "3C", 3.5);
        // Mahasiswa22 mhs4 = new Mahasiswa22("21212203", "Dirga", "4D", 3.6);
        do {
            System.out.println("Menu: ");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihUtama = sc.nextInt();
            switch (pilihUtama) {
                case 1:
                    System.out.println("Tambah Data Mahasiswa:");
                    System.out.print("Nim: ");
                    String nim = sc.next();
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("Kelas: ");
                    String kelas = sc.next();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    Mahasiswa22 mhs = new Mahasiswa22(nim, nama, kelas, ipk);

                    menuTambahData();
                    pilihTambah = sc.nextInt();

                    switch (pilihTambah) {
                        case 1:
                            sll.addFirst(mhs);
                            break;
                        case 2:
                            sll.addLast(mhs);
                            break;
                        case 3:
                            System.out.print("Masukkan Nama Data yang Akan Dimasukkan: ");
                            String key = sc.next();
                            sll.insertAfter(key, mhs);
                            break;
                        case 4:
                            System.out.print("Masukkan Index Data yang Akan Dimasukkan: ");
                            int index = sc.nextInt();
                            sll.insertAt(index, mhs);
                            break;
                        default:
                            System.out.println("Pilihan Tidak Tersedia");
                        }
                        sll.print();
                    break;
                case 2:
                    sll.print();
                    break;
                case 0:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
            }
        } while (pilihUtama != 0);   
        sc.close();
    }
}
