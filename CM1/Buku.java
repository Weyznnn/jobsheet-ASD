public class Buku {
    String kodeBuku, judul;
    int thnTerbit;

    Buku (String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        thnTerbit = tahunTerbit;
    }
    
    void tampilBuku() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun Terbit: " + thnTerbit);
    }
}