public class MahasiswaBerprestasi23 {
    Mahasiswa23 [] listMhs = new Mahasiswa23[5];
    int idx;

    void tambah(Mahasiswa23 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa23 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa23 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk > listMhs[idxMax].ipk) {
                    idxMax = j;
                }
            }
            Mahasiswa23 tmp = listMhs[idxMax];
            listMhs[idxMax] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
}
