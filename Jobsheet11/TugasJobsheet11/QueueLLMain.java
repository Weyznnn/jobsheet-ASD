package Jobsheet11.TugasJobsheet11;

import java.util.Scanner;

public class QueueLLMain {
    public static void menu() {
        System.out.println("Pilih Menu");
        System.out.println("1. Masukkan Data Mahasiswa");
        System.out.println("2. Panggil Mahasiswa");
        System.out.println("3. Lihat antrian Terdepan dan Terbelakang");
        System.out.println("4. Lihat Jumlah Data dalam Queue");
        System.out.println("5. Clear Queue");
        System.out.println("6. Keluar");
        System.out.println("==============================");
        System.out.print("Pilih: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLL22 queue = new QueueLL22();
        int pilihan;
        do {
            menu();
            pilihan = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas Mahasiswa: ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan IPK Mahasiswa: ");
                    double ipk = sc.nextDouble();
                    queue.enqueue(new Mahasiswa22(nim, nama, kelas, ipk));
                    break;
                case 2:
                    Mahasiswa22 removed = queue.dequeue();
                    if (removed != null) {
                        System.out.println("Panggilan Mahasiswa: ");
                        removed.tampilInformasi();
                    }
                    break;
                case 3:
                    queue.showHeadTail();
                    break;
                case 4:
                    System.out.println("Jumlah Data dalam Queue: " + queue.sizeLL());
                    break;
                case 5:
                    queue.clear();
                    System.out.println("Queue telah dikosongkan");
                    break;
                case 6:
                    System.out.println("Keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
            System.out.println("==============================\n");
        } while (pilihan != 6);
        sc.close();
    }
}
