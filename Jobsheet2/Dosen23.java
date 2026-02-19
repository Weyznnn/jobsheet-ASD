public class Dosen23 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen23() {
    }

    public Dosen23(String id, String nama, boolean status, int tahunGabung, String keahlian) {
        idDosen = id;
        this.nama = nama;
        statusAktif = status;
        tahunBergabung = tahunGabung;
        bidangKeahlian = keahlian;
    }

     void tampilkanInformasi() {
        System.out.println("ID Dosen            : " + idDosen);
        System.out.println("Nama Dosen          : " + nama);
        System.out.println("Status Aktif        : " + statusAktif);
        System.out.println("Tahun Bergabung     : " + tahunBergabung);
        System.out.println("Bidang Keahlian     : " + bidangKeahlian);
    }
    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrng) {
        return thnSkrng - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
