import java.util.Scanner;

public class MahasiswaDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();
        // Mahasiswa23 m1 = new Mahasiswa23("123", "Zidan", "2A", 3.2);
        // Mahasiswa23 m2 = new Mahasiswa23("124", "Ayu", "2A", 3.5);
        // Mahasiswa23 m3 = new Mahasiswa23("125", "Sofi", "2A", 3.1);
        // Mahasiswa23 m4 = new Mahasiswa23("126", "Sita", "2A", 3.9);
        // Mahasiswa23 m5 = new Mahasiswa23("127", "Miki", "2A", 3.7);
        for (int i = 0; i < 5; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            Mahasiswa23 m = new Mahasiswa23(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) dengan selection sort:");
        list.selectionSort();
        list.tampil();

        sc.close();
    }
}
