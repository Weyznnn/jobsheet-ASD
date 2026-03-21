package minggu5;

public class Tugas {
    String nama, nim;
    int tahunMasuk, nilaiUTS, nilaiUAS;

    Tugas(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    static void nilaiUTSPalingTinggi(Tugas[] mahasiswa) {
        int maxUTS = 0;
        String namaMahasiswa = "";
        for (Tugas mhs : mahasiswa) {
            if (mhs.nilaiUTS > maxUTS) {
                maxUTS = mhs.nilaiUTS;
                namaMahasiswa = mhs.nama;
            }
        }
        System.out.println("Nilai UTS tertinggi: " + maxUTS + " oleh " + namaMahasiswa);
    }

    private static Tugas cariNilaiUTS(Tugas[] mahasiswa, int awal, int akhir, String maxOrMin) {
        if (awal == akhir) {
            return mahasiswa[awal];
        }
        int tengah = (awal + akhir) / 2;
        Tugas maxKiri = cariNilaiUTS(mahasiswa, awal, tengah, maxOrMin);
        Tugas maxKanan = cariNilaiUTS(mahasiswa, tengah + 1, akhir, maxOrMin);
        if (maxOrMin.equals("max")) {
            return maxKiri.nilaiUTS > maxKanan.nilaiUTS ? maxKiri : maxKanan;
        } else {
            return maxKiri.nilaiUTS < maxKanan.nilaiUTS ? maxKiri : maxKanan;
            
        }
    }

    static void nilaiUTSPalingTinggiDC(Tugas[] mahasiswa) {
        if (mahasiswa.length == 0) return;
        Tugas mhsMaxUTS = cariNilaiUTS(mahasiswa, 0, mahasiswa.length - 1, "max");
        System.out.println("Nilai UTS tertinggi: " + mhsMaxUTS.nilaiUTS + " oleh " + mhsMaxUTS.nama);
    }
    
    static void nilaiUTSPalingRendahDC(Tugas[] mahasiswa) {
        if (mahasiswa.length == 0) return;
        Tugas mhsMinUTS = cariNilaiUTS(mahasiswa, 0, mahasiswa.length - 1, "min");
        System.out.println("Nilai UTS terendah: " + mhsMinUTS.nilaiUTS + " oleh " + mhsMinUTS.nama);
    }

    static int rataRataNilaiUASBF(Tugas[] mahasiswa) {
        int totalNilaiUAS = 0;
        for (Tugas mhs : mahasiswa) {
            totalNilaiUAS += mhs.nilaiUAS;
        }
        return mahasiswa.length > 0 ? totalNilaiUAS / mahasiswa.length : 0;
    }
}