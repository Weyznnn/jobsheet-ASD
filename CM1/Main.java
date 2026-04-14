import java.util.Scanner;

public class Main {

    static void menuDashboard() {
        System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Tampilkan Peminjaman");
        System.out.println("4. Urutkan Berdasarkan Denda");
        System.out.println("5. Cari Berdasarkan NIM");
        System.out.println("0. Keluar");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        Peminjaman dummy = new Peminjaman();

        // Penghitungan denda untuk semua data peminjaman
        for (int i = 0; i < Data.arrPinjam.length; i++) {
            Data.arrPinjam[i].hitungDenda();
        }

        do {
            menuDashboard();
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (pilihan) {
                case 1:
                    // Tampilkan Mahasiswa
                    System.out.println("Daftar Mahasiswa:");
                    for (int i = 0; i < Data.arrMhs.length; i++) {
                        Data.arrMhs[i].tampilMhs();
                    }
                    break;
                case 2:
                    // Tampilkan Buku
                    System.out.println("Daftar Buku:");
                    for (int i = 0; i < Data.arrBuku.length; i++) {
                        Data.arrBuku[i].tampilBuku();
                    }
                    break;
                case 3:
                    // Tampilkan Peminjaman
                    System.out.println("Data Peminjaman:");
                    for (int i = 0; i < Data.arrPinjam.length; i++) {
                        Data.arrPinjam[i].tampilPeminjaman();
                    }
                    break;
                case 4:
                    // Urutkan Berrdasarkan Denda
                    dummy.urutkanDenda(Data.arrPinjam);
                    System.out.println("Setelah diurutkan (Denda Terbesar):");
                    for (int i = 0; i < Data.arrPinjam.length; i++) {
                        Data.arrPinjam[i].tampilPeminjaman();
                    }
                    break;
                case 5:
                    // Cari Berdasarkan NIM
                    System.out.print("Masukkan NIM: ");
                    String nimDiCari = sc.nextLine();
                    dummy.cariNim(nimDiCari, Data.arrPinjam);
                    break;
                case 0:
                    // Keluar
                    System.out.println("Good Bye!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
            System.out.println();
        } while (pilihan != 0);
        sc.close();
    }
}
