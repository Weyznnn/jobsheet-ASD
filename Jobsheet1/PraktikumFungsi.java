public class PraktikumFungsi {
    static double pendapatanCabang[] = new double[4];

    static void pendapatanCabang(int stockBunga[][], double hargaBunga[]) {
        for (int i = 0; i < stockBunga.length; i++) {
            double totalPendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            pendapatanCabang[i] = totalPendapatan;
            System.out.println("Pendapatan Royal Garden " + (i + 1) + ": Rp " + totalPendapatan);
        }
    }

    static void evaluasiPendapatan(double pendapatanCabang[]) {
        for (int i = 0; i < pendapatanCabang.length; i++) {
            if (pendapatanCabang[i] > 1500000) {
                System.out.println("Pendapatan Royal Garden "+(i+1)+" Sangat Baik!");
            } else {
                System.out.println("Pendapatam Royal Garden "+(i+1)+" Perlu Evaluasi!");
            }
        }
    }
    public static void main(String[] args) {
        int stockBunga[][] = {{10, 5, 15, 7},
                              {6, 11, 9, 12},
                              {2, 10, 10, 5},
                              {5, 7, 12, 9}};
        double hargaBunga[] = {75000, 50000, 60000, 10000};
        System.out.println("================================");
        System.out.println("Pendapatan Toko Bunga Setiap Cabang");
        System.out.println("================================");
        pendapatanCabang(stockBunga, hargaBunga);

        System.out.println("================================");
        System.out.println("Evaluasi Pendapatan Cabang");
        System.out.println("================================");
        evaluasiPendapatan(pendapatanCabang);
        System.out.println("================================");
    }
}
