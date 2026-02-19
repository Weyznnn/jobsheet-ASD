public class MataKuliah23 {
    //atribut
    String kodeMK, nama;
    int sks, jumlahJam;

    //kostruktor
    public MataKuliah23() {
    } 

    public MataKuliah23(String kodeMk, String nm, int sks, int jumlahJam) {
        this.kodeMK = kodeMk;
        nama = nm;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

     void tampilkanInformasi() {
        System.out.println("Nama                : " + nama);
        System.out.println("Kode Mata Kuliah    : " + kodeMK);
        System.out.println("sks                 : " + sks);
        System.out.println("Jumlah Jam          : " + jumlahJam);
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah");
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam pelajaran menjadi "+jumlahJam+" jam");
    }

    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan jam tidak dapat dilakukan karena jam melebihi jumlah jam");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam pelajaran menjadi "+jumlahJam+" jam");
        }
    }
}
