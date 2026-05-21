import java.util.Scanner;

public class MainDemo {
    public static void table() {
        System.out.println("==============================");
        System.out.println("SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("==============================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueDLLPembeli antrianPembeli = new QueueDLLPembeli();
        QueueDLLPesanan antrianPesanan = new QueueDLLPesanan();
        int pilih = 0;

        // Penunggu restoran
        Pembeli pembeli1 = new Pembeli("Ainra", "08224500000");
        Pembeli pembeli2 = new Pembeli("Danra", "08224511111");
        Pembeli pembeli3 = new Pembeli("Sanri", "08224522222");
        antrianPembeli.addLast(pembeli1);
        antrianPembeli.addLast(pembeli2);
        antrianPembeli.addLast(pembeli3);
        
        do {
            table();
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    //Tambah antrian
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP : ");
                    String noHP = sc.nextLine();

                    Pembeli pembeli = new Pembeli(nama, noHP);
                    antrianPembeli.addLast(pembeli);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + (antrianPembeli.size+1));
                    break;
                case 2:
                    //Cetak antrian
                    antrianPembeli.printQueue();
                    break;
                case 3:
                    //Hapus antrian
                    NodeDLLPembeli removedPembeli = antrianPembeli.removeFirst();
                    if (removedPembeli != null) {
                        System.out.print("Kode Pesanan : ");
                        int kodePesanan = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Harga : ");
                        int harga = sc.nextInt();
                        sc.nextLine();
                        Pesanan pesanan = new Pesanan(kodePesanan, namaPesanan, harga);
                        antrianPesanan.addLast(pesanan);
                        System.out.println(removedPembeli.node.namaPembeli + " telah memesan Es Teler");
                    }
                    break;
                case 4:
                    //Laporan pesanan
                    antrianPesanan.printQueue();
                    break;
                }
            } while (pilih != 0);
            sc.close();
        }
    }