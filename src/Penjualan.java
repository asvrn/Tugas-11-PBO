public class Penjualan extends Transaksi implements Pembayaran {
    public Penjualan(String noFaktur, String namaPelanggan, String noHp, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(noFaktur, namaPelanggan, noHp, namaBarang, hargaBarang, jumlahBeli);
    }

    @Override
    public double hitungTotalBayar() {
        return hargaBarang * getJumlahBeli();
    }

    @Override
    public void setJumlahBeli(int jumlahBeli) {
        super.setJumlahBeli(jumlahBeli);
    }

    public int getJumlahBeli() {
        return super.jumlahBeli;
    }

    // Override metode tampilkanDetailTransaksi dari kelas dasar
    @Override
    public void tampilkanDetailTransaksi() {
        super.tampilkanDetailTransaksi();
        System.out.println("Total Bayar\t: " + hitungTotalBayar());
    }
}
