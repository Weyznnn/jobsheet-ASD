package TugasJobsheet10;

import java.util.Scanner;

public class LayananCetakKRS23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianPesertujuanKRS23 antrian = new AntrianPesertujuanKRS23(10);
        int pilihan;

        do {
            System.out.println("=== Layanan Cetak KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil 2 Mahasiswa dari Antrian");
            System.out.println("3. Kosongkan Antrian");
            System.out.println("4. Tampilkan Semua Mahasiswa dalam Antrian");
            System.out.println("5. Lihat 2 Mahasiswa Antrian Terdepan");
            System.out.println("6. Lihat Mahasiswa Antrian Paling Belakang");
            System.out.println("7. Lihat Jumlah Antrian Saat Ini");
            System.out.println("8. Tampilkan Jumlah Mahasiswa yang Sudah Mengajukan KRS");
            System.out.println("9. Tampilkan Jumlah Mahasiswa yang Belum Mengajukan KRS");
            System.out.println("10. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa23 mhs = new Mahasiswa23(nim, nama, prodi, kelas);
                    antrian.menambahkanAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa23 mhs1 = antrian.memanggilAntrean();
                    if (mhs1 != null) {
                        System.out.println("Mahasiswa yang dipanggil:");
                        mhs1.tampilkanData();
                    }
                    Mahasiswa23 mhs2 = antrian.memanggilAntrean();
                    if (mhs2 != null) {
                        System.out.println("Mahasiswa yang dipanggil:");
                        mhs2.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.clear();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    antrian.lihat2Terdepan();
                    break;
                case 6:
                    antrian.lihatBelakang();
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 8:
                    antrian.getMhsProses();
                    break;
                case 9:
                    antrian.getMHSBelumReqKRS();
                    break;
                case 10:
                    System.out.println("Terima kasih telah menggunakan layanan cetak KRS.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        } while (pilihan != 10);
        sc.close();
    }
}
