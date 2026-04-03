public class DosenDemo23 {
    
    public static void main(String[] args) {
        DataDosen23 listDosen = new DataDosen23();
        Dosen23 d1 = new Dosen23("D001", "Pak Andi", true, 45);
        Dosen23 d2 = new Dosen23("D002", "Bu Siti", false, 38);
        Dosen23 d3 = new Dosen23("D003", "Pak Budi", true, 50);
        Dosen23 d4 = new Dosen23("D004", "Bu Rina", false, 42);
        Dosen23 d5 = new Dosen23("D005", "Pak Joko", true, 35);
        Dosen23 d6 = new Dosen23("D006", "Bu Maya", false, 40);
        Dosen23 d7 = new Dosen23("D007", "Pak Agus", true, 48);
        Dosen23 d8 = new Dosen23("D008", "Bu Lina", false, 37);
        Dosen23 d9 = new Dosen23("D009", "Pak Rudi", true, 43);
        Dosen23 d10 = new Dosen23("D010", "Bu Sari", false, 39);

        listDosen.tambah(d1);
        listDosen.tambah(d2);
        listDosen.tambah(d3);
        listDosen.tambah(d4);
        listDosen.tambah(d5);
        listDosen.tambah(d6);
        listDosen.tambah(d7);
        listDosen.tambah(d8);
        listDosen.tambah(d9);
        listDosen.tambah(d10);

        System.out.println("Data Dosen sebelum sorting:");
        listDosen.tampil();
        System.out.println("Data Dosen setelah sorting berdasarkan usia mengggunakan Bubble Sort (ASC):");
        listDosen.bubbleSortASC();
        listDosen.tampil();

        System.out.println("Data Dosen setelah sorting berdasarkan usia menggunakan Selection Sort (DESC):");
        listDosen.selectionSortDESC();
        listDosen.tampil();

        System.out.println("Data Dosen setelah sorting berdasarkan usia menggunakan Insertion Sort (DESC):");
        listDosen.insertionSortDESC();
        listDosen.tampil();

    }
}
