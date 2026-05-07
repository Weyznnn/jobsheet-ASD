package Jobsheet11;

public class Mahasiswa22 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa22() {
    }

    public Mahasiswa22(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t\t\t" + kelas + "\t\t" + ipk);
    }
}