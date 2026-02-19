public class DosenMain23 {
    public static void main(String[] args) {
        Dosen23 dsn1 = new Dosen23();
        dsn1.nama = "Hendrawati Kusnaidi";
        dsn1.idDosen = "432533";
        dsn1.tahunBergabung = 2013;
        dsn1.statusAktif = true;
        dsn1.bidangKeahlian = "Pancasila";

        dsn1.tampilkanInformasi();
        System.out.println(dsn1.hitungMasaKerja(2023));
        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("Pertanian Otomatis");
        dsn1.tampilkanInformasi();

        Dosen23 dsn2 = new Dosen23("3403942", "Danustika Maharaja", true, 2017, "Pencaksilat");
        dsn2.tampilkanInformasi();
        System.out.println(dsn2.hitungMasaKerja(2023));
        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Networking");
        dsn2.tampilkanInformasi();

    }
}
