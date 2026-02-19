public class Mahasiswamain23 {
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
        if (ipkBaru <= 4.0 && ipkBaru >= 0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
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
    public static void main(String[] args) {
        Mahasiswamain23 mhs1 = new Mahasiswamain23();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();
    }
}
