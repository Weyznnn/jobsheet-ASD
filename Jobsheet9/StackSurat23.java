public class StackSurat23 {
    Surat23[] stackSurat;
    int top, size;

    public StackSurat23(int size) {
        this.size = size;
        stackSurat = new Surat23[size];
        top = -1;
    }
    
    public boolean isFull() {
        return top == stackSurat.length - 1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public void terimaSurat(Surat23 surat) {
        if (isFull()) {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        } else {
            top++;
            stackSurat[top] = surat;
            System.out.println("Surat diterima: " + surat.namaMahasiswa);
        }
    }

    public Surat23 prosesSurat() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat yang diproses.");
            return null;
        } else {
            Surat23 surat = stackSurat[top];
            top--;
            System.out.println("Surat diproses: " + surat.namaMahasiswa);
            return surat;
        }
    }

    public Surat23 lihatSuratTerakhir() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat terakhir.");
            return null;
        } else {
            return stackSurat[top];
        }
    }

    public void cariSurat(String namaMahasiswa) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stackSurat[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat ditemukan!");
                System.out.println("ID Surat: " + stackSurat[i].idSurat);
                System.out.println("Nama Mahasiswa: " + stackSurat[i].namaMahasiswa);
                System.out.println("Kelas: " + stackSurat[i].kelas);
                System.out.println("Jenis Izin: " + stackSurat[i].jenisIzin);
                System.out.println("Durasi: " + stackSurat[i].durasi);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dengan nama mahasiswa '" + namaMahasiswa + "' tidak ditemukan.");
        }
    }
}
