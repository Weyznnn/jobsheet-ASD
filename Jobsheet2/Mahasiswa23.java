public class Mahasiswa23 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama    : " + nama);
        System.out.println("Nim     : " + nim);
        System.out.println("Kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
    }
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIPK(double ipkBaru) {
        ipk = ipkBaru;
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}
