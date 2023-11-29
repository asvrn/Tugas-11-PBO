import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       try {
            try (Scanner scan = new Scanner(System.in)) {
                System.out.print("Masukkan No Faktur: ");
                String noFaktur = scan.nextLine();

                System.out.print("Masukkan Nama Pelanggan: ");
                String namaPelanggan = scan.nextLine();

                System.out.print("Masukkan No HP: ");
                String noHp = scan.nextLine();

                System.out.print("Masukkan Nama Barang: ");
                String namaBarang = scan.nextLine();

         double hargaBarang = 0;
                boolean inputValid = false;
                while (!inputValid) {
                    try {
                        System.out.print("Masukkan Harga Barang: ");
                        hargaBarang = scan.nextDouble();
                        scan.nextLine();  // Consume the newline character
                        new Transaksi("", "", "", "", hargaBarang, 0); // untuk memastikan hargaBarang valid
                        inputValid = true;
                    } catch (InputMismatchException | IllegalArgumentException e) {
                        System.out.println("Masukan tidak valid. Harga barang harus berupa angka.");
                        scan.nextLine();  // Membersihkan buffer masukan
                    }
                }

                int jumlahBeli;
                do {
                    try {
                        System.out.print("Masukkan Jumlah Beli (max 1000): ");
                        jumlahBeli = scan.nextInt();
                        new Transaksi("", "", "", "", 0, jumlahBeli); // untuk memastikan jumlahBeli valid
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        jumlahBeli = -1; // Mengatur jumlahBeli menjadi -1 agar loop terus berlanjut
                    }
                } while (jumlahBeli == -1); 

                // Membuat objek Penjualan
                Penjualan penjualan = new Penjualan(noFaktur, namaPelanggan, noHp, namaBarang, hargaBarang, jumlahBeli);

                // Menampilkan detail transaksi
                penjualan.tampilkanDetailTransaksi();
            }

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
        }
    }
