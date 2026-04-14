public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam, terlambat, denda;
    int dendaPerHari = 2000, batasPinjam = 5;
    
    Peminjaman() {
    }
    
    Peminjaman (Mahasiswa mahasiswa, Buku buku, int lamaPinjam) {
        mhs = mahasiswa;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * dendaPerHari;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }
    
    void urutkanDenda(Peminjaman []arrPinjam) {
        for (int i = 1; i < arrPinjam.length; i++) {
            Peminjaman temp = arrPinjam[i];
            int j = i;
            while (j > 0 && arrPinjam[j - 1].denda < temp.denda) {
                arrPinjam[j] = arrPinjam[j - 1];
                j--;
            }
            arrPinjam[j] = temp;
        }
    }
    
    void cariNim(String cari, Peminjaman []arrPinjam) {
        boolean notFound = true;
        for (int j = 0; j < arrPinjam.length; j++) {
            if (arrPinjam[j].mhs.nim.equals(cari)) {
                notFound = false;
                System.out.println(Data.arrPinjam[j].mhs.nama + " | " + Data.arrPinjam[j].buku.judul + " | Lama: " + arrPinjam[j].lamaPinjam + " | Terlambat: " + arrPinjam[j].terlambat + " | Denda: " + arrPinjam[j].denda);
            }
        }
        if (notFound) {
            System.out.println("NIM tidak ditemukan.");
        }
    }

    void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama Pinjam: " + lamaPinjam + " | Denda: " + denda);
    }
}