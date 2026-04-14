public class Data {
    static Mahasiswa []arrMhs = new Mahasiswa[3];
    static Buku []arrBuku = new Buku[4];
    static Peminjaman []arrPinjam = new Peminjaman[5];

    // Data Mahasiswa
        static {
            arrMhs[0] = new Mahasiswa("22001", "Andi", "Teknik Informatika");
            arrMhs[1] = new Mahasiswa("22002", "Budi", "Teknik Informatika");
            arrMhs[2] = new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis");
        }

    // Data Buku
        static {
            arrBuku[0] = new Buku("B001", "Algoritma", 2020);
            arrBuku[1] = new Buku("B002", "Basis Data", 2019);
            arrBuku[2] = new Buku("B003", "Pemrograman", 2021);
            arrBuku[3] = new Buku("B004", "Fisika", 2018);
        }

    // Data Peminjaman
        static {
            arrPinjam[0] = new Peminjaman(arrMhs[0], arrBuku[0], 7);
            arrPinjam[1] = new Peminjaman(arrMhs[1], arrBuku[1], 3);
            arrPinjam[2] = new Peminjaman(arrMhs[2], arrBuku[2], 10);
            arrPinjam[3] = new Peminjaman(arrMhs[2], arrBuku[3], 6);
            arrPinjam[4] = new Peminjaman(arrMhs[0], arrBuku[1], 4);
        }
}
