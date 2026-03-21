package minggu5;

public class TugasMain {
    public static void main(String[] args) {
        Tugas[] mahasiswa = new Tugas[8];
        mahasiswa[0] = new Tugas("Ahmad", "220101001", 2022, 78, 82);
        mahasiswa[1] = new Tugas("Budi", "220101002", 2022, 85, 88);
        mahasiswa[2] = new Tugas("Cindy", "220101003", 2021, 90, 87);
        mahasiswa[3] = new Tugas("Dian", "220101004", 2021, 76, 79);
        mahasiswa[4] = new Tugas("Eko", "220101005", 2023, 93, 95);
        mahasiswa[5] = new Tugas("Fajar", "220101006", 2023, 80, 85);
        mahasiswa[6] = new Tugas("Gina", "220101007", 2022, 88, 90);
        mahasiswa[7] = new Tugas("Hadi", "220101008", 2021, 82, 84);

        System.out.println("=== Data Mahasiswa ===");
        for (Tugas mhs : mahasiswa) {
            System.out.println("Nama: " + mhs.nama + ", NIM: " + mhs.nim + ", Tahun Masuk: " + mhs.tahunMasuk + ", Nilai UTS: " + mhs.nilaiUTS + ", Nilai UAS: " + mhs.nilaiUAS);
        }
        System.out.println("\n=== Nilai UTS Tertinggi ===");
        Tugas.nilaiUTSPalingTinggi(mahasiswa);
        System.out.println("\n=== Nilai UTS Terendah ===");
        Tugas.nilaiUTSPalingRendahDC(mahasiswa);
        System.out.println("\n=== Rata-rata Nilai UAS ===");
        System.out.println("Rata-rata Nilai UAS: " + Tugas.rataRataNilaiUASBF(mahasiswa));
    }
}
