package jobsheet3;

public class Dosen23 {
    public String nama;
    public String kode;
    public boolean jenisKelamin;
    public int usia;

    public Dosen23(String kode, String nama, boolean jenisKelamin, int usia) {
        this.nama = nama;
        this.kode = kode;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    public void printData() {
        System.out.println("Nama: " + nama);
        System.out.println("Kode: " + kode);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki" : "Wanita"));
        System.out.println("Usia: " + usia);
        System.out.println("-----------------------------");
    }
}
