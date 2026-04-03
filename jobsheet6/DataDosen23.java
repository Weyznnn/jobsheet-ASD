public class DataDosen23 {
    Dosen23[] dataDosen = new Dosen23[10];
    int idx;

    void tambah(Dosen23 d) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampilData();
            System.out.println("-------------------");
        }
    }

    void bubbleSortASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen23 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void selectionSortDESC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen23 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSortDESC() {
        for (int i = 1; i < idx; i++) {
            Dosen23 key = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia < key.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = key;
        }
    }
}
