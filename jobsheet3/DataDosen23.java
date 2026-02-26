package jobsheet3;

public class DataDosen23 {
    
    public static void dataSemuaDosen(Dosen23[] arrayOfDosen) {
        System.out.println("=== DATA SEMUA DOSEN ===");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            Dosen23 dosen = arrayOfDosen[i];
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println(dosen.kode);
            System.out.println(dosen.nama);
            System.out.println(dosen.jenisKelamin ? "Laki-laki" : "Wanita");
            System.out.println(dosen.usia);
            System.out.println("-----------------------------");
        }
    }
    
    public static void jumlahDosenPerJenisKelamin(Dosen23[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen23 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        System.out.println("Pria: " + pria);
        System.out.println("Wanita: " + wanita);
    }
    
    public static void rerataUsiaDosenPerJenisKelamin(Dosen23[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;
        
        for (Dosen23 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }
        System.out.println("=== RATA-RATA USIA DOSEN PER JENIS KELAMIN ===");
        System.out.println("Rata-rata Usia Pria: " + (jumlahPria > 0 ? totalUsiaPria / jumlahPria : 0));
        System.out.println("Rata-rata Usia Wanita: " + (jumlahWanita > 0 ? totalUsiaWanita / jumlahWanita : 0));
    }
    
    public static void infoDosenPalingTua(Dosen23[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen23 dosenTua = arrayOfDosen[0];
        for (Dosen23 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }
        System.out.println("=== DOSEN PALING TUA ===");
        System.out.println("Kode: " + dosenTua.kode);
        System.out.println("Nama: " + dosenTua.nama);
        System.out.println("Jenis Kelamin: " + (dosenTua.jenisKelamin ? "Laki-laki" : "Wanita"));
        System.out.println("Usia: " + dosenTua.usia);
    }
    
    public static void infoDosenPalingMuda(Dosen23[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen23 dosenMuda = arrayOfDosen[0];
        for (Dosen23 dosen : arrayOfDosen) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }
        System.out.println("=== DOSEN PALING MUDA ===");
        System.out.println("Kode: " + dosenMuda.kode);
        System.out.println("Nama: " + dosenMuda.nama);
        System.out.println("Jenis Kelamin: " + (dosenMuda.jenisKelamin ? "Laki-laki" : "Wanita"));
        System.out.println("Usia: " + dosenMuda.usia);
    }
}