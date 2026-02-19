public class MataKuliahMain23 {
    public static void main(String[] args) {
        MataKuliah23 mk1 = new MataKuliah23();
        mk1.jumlahJam = 67;
        mk1.kodeMK = "BD";
        mk1.nama = "Basis Data";
        mk1.sks = 14;

        mk1.tampilkanInformasi();
        mk1.tambahJam(5);
        mk1.kurangiJam(87);
        mk1.ubahSKS(12);
        mk1.tampilkanInformasi();
        
        MataKuliah23 mk2 = new MataKuliah23("DP", "Dasar Pemrograman", 23, 45);
        
        mk2.tampilkanInformasi();
        mk2.tambahJam(45);
        mk2.kurangiJam(34);
        mk2.ubahSKS(110);
        mk2.tampilkanInformasi();
    }
}
