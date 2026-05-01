package TugasJobsheet10;

public class AntrianPesertujuanKRS23 {
    Mahasiswa23[] antrian;
    int front, rear, size, maxSize, mhsDPA;
    
    public AntrianPesertujuanKRS23(int size) {
        maxSize = size;
        antrian = new Mahasiswa23[size];
        front = 0;
        rear = -1;
        size = 0;
        mhsDPA = 30;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == maxSize) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = size = 0;
            rear = -1;
            System.out.println("Antrian berhasil dikosongkan!");
        } else {
            System.out.println("Antrian sudah kosong!");
        }
    }

    public void menambahkanAntrian(Mahasiswa23 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        } else {
            rear = (rear + 1) % maxSize;
            antrian[rear] = mhs;
            size++;
            mhsDPA--;
            System.out.println(mhs.nama + " berhasil masuk ke antrian.");
        }
    }
    
    public Mahasiswa23 memanggilAntrean() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dapat dipanggil.");
            return null;
        }
        Mahasiswa23 mhs = antrian[front];
        front = (front + 1) % maxSize;
        size--;
        return mhs;
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % maxSize;
            System.out.print((i + 1) + ". ");
            antrian[index].tampilkanData();
        }
    }

    public void lihat2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("NIM - NAMA - PRODI - KELAS");
            antrian[front].tampilkanData();
            antrian[(front + 1) % maxSize].tampilkanData();
        }
    }

    public void lihatBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("NIM - NAMA - PRODI - KELAS");
            antrian[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void getMhsProses() {
        System.out.println("Jumlah mahasiswa yang sudah dilayani: " + (30 - mhsDPA));
    }

    public void getMHSBelumReqKRS() {
        System.out.println("Jumlah mahasiswa yang belum mengajukan KRS: " + mhsDPA);
    }
}