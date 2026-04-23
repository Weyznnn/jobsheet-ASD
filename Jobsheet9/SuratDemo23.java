import java.util.Scanner;

public class SuratDemo23 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        StackSurat23 stackSurat = new StackSurat23(5);
        do {
            System.out.println("Menu:");
            System.out.println("1. Terima Surat");
            System.out.println("2. Proses Surat");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I/L): ");
                    char jenisIzin = sc.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Surat23 surat = new Surat23(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stackSurat.terimaSurat(surat);
                    break;
                case 2:
                    Surat23 diproses = stackSurat.prosesSurat();
                    if (diproses != null) {
                        String jenis = (diproses.jenisIzin == 'S') ? "Sakit" : "Izin Keperluan Lain";
                        System.out.println("Memproses surat izin dari: " + diproses.namaMahasiswa);
                        System.out.println("ID Surat   : " + diproses.idSurat);
                        System.out.println("Kelas      : " + diproses.kelas);
                        System.out.println("Jenis Izin : " + jenis);
                        System.out.println("Durasi     : " + diproses.durasi + " hari");
                        System.out.println("Status     : Surat telah diverifikasi.");
                    }
                    break;
                case 3:
                    Surat23 terakhir = stackSurat.lihatSuratTerakhir();
                    if (terakhir != null) {
                        String jenis = (terakhir.jenisIzin == 'S') ? "Sakit" : "Izin Keperluan Lain";
                        System.out.println("Surat terakhir yang diterima: " + terakhir.namaMahasiswa);
                        System.out.println("ID Surat   : " + terakhir.idSurat);
                        System.out.println("Kelas      : " + terakhir.kelas);
                        System.out.println("Jenis Izin : " + jenis);
                        System.out.println("Durasi     : " + terakhir.durasi + " hari");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    stackSurat.cariSurat(cariNama);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5);
        sc.close();
    }
}