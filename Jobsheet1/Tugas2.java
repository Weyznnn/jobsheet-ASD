import java.util.Scanner;

public class Tugas2 {
    static Scanner sc = new Scanner(System.in);

    static int dashboard() {
        System.out.println("===== DASHBOARD =====");
        System.out.println("1. Input Jadwal Mata Kuliah");
        System.out.println("2. Tampilkan Jadwal Mata Kuliah");
        System.out.println("3. Cek jadwal pada hari tertentu");
        System.out.println("4. Cek jadwal pada mata kuliah tertentu");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
        return sc.nextInt();
    }
    
    static void inputJadwal(String jadwal[][], int jumlahMK) {
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang Mata Kuliah: ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari Mata Kuliah: ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Waktu Mata Kuliah: ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    static void tampilJadwal(String jadwal[][], int jumlahMK) {
        if (jumlahMK == 0) {
            System.out.println("Belum ada jadwal yang diinput!");
            return;
        }
        System.out.println("==============================");
        System.out.println("Jadwal Mata Kuliah:");
        System.out.printf("%-5s %-25s %-15s %-10s %-10s%n", "No", "Nama Mata Kuliah", "Ruang", "Hari", "Waktu");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-5d %-25s %-15s %-10s %-10s%n", (i + 1), jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    static void cekJadwalHari(String jadwal[][], int jumlahMK) {
        if (jumlahMK == 0) {
            System.out.println("Belum ada jadwal yang diinput!");
            return;
        }
        System.out.print("Masukkan hari yang ingin dicek: ");
        String hari = sc.nextLine();
        System.out.println("==============================");
        System.out.println("Jadwal Mata Kuliah pada hari " + hari + ":");
        System.out.printf("%-5s %-25s %-15s %-10s %-10s%n", "No", "Nama Mata Kuliah", "Ruang", "Hari", "Waktu");
        for (int i = 0; i < jumlahMK; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-5d %-25s %-15s %-10s %-10s%n", (i + 1), jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
    }

    static void cekJadwalMK(String jadwal[][], int jumlahMK) {
        if (jumlahMK == 0) {
            System.out.println("Belum ada jadwal yang diinput!");
            return;
        }
        System.out.print("Masukkan nama mata kuliah yang ingin dicek: ");
        String namaMK = sc.nextLine();
        System.out.println("==============================");
        System.out.println("Jadwal Mata Kuliah " + namaMK + ":");
        System.out.printf("%-5s %-25s %-15s %-10s %-10s%n", "No", "Nama Mata Kuliah", "Ruang", "Hari", "Waktu");
        for (int i = 0; i < jumlahMK; i++) {
            if (jadwal[i][0].equalsIgnoreCase(namaMK)) {
                System.out.printf("%-5d %-25s %-15s %-10s %-10s%n", (i + 1), jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
    }

    public static void main(String[] args) {
        int jumlahMK = 0;
        boolean keluar = true;
        String jadwal[][] = new String[0][0];
        
        do {
            int pilihan = dashboard();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah mata kuliah yang diambil: ");
                    jumlahMK = sc.nextInt();
                    sc.nextLine();
                    jadwal = new String[jumlahMK][4];
                    inputJadwal(jadwal, jumlahMK);
                    break;
                case 2:
                    tampilJadwal(jadwal, jumlahMK);
                    break;
                case 3:
                    cekJadwalHari(jadwal, jumlahMK);
                    break;
                case 4:
                    cekJadwalMK(jadwal, jumlahMK);
                    break;
                case 5:
                    keluar = false;
                    break;
                default:
                    System.out.println("Masukan pilihan yang valid (1-5)!");
            }
            
        } while (keluar);

    }
}
