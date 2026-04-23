import java.util.Scanner;

public class MahasiswaDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        StackTugasMahasiswa23 stack = new StackTugasMahasiswa23(5);
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Hapus Tugas");
            System.out.println("3. Lihat Tugas Terakhir");
            System.out.println("4. Lihat Tugas Pertama");
            System.out.println("5. Hitung Jumlah Tugas");
            System.out.println("6. Tampilkan Semua Tugas");
            System.out.println("7. Keluar");
            System.out.print("Pilih opsi: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa23 mhs = new Mahasiswa23(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa23 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.println("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        sc.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiswa23 lihatTop = stack.peek();
                    if (lihatTop != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihatTop.nama);
                    }
                    break;
                case 4:
                    Mahasiswa23 lihatBottom = stack.peekBottom();
                    if (lihatBottom != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihatBottom.nama);
                    }
                    break;
                case 5:
                    System.out.println("Banyak tugas yang dikumpulkan: " + stack.hitungTugas());
                    break;
                case 6:
                    System.out.println("Daftar semua Tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 7);
        sc.close();
    }
}
