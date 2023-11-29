public class Transaksi {
    private String noFaktur;
    private String namaPelanggan;
    private String noHp;
    private String namaBarang;
    protected double hargaBarang;
    protected int jumlahBeli;

    public Transaksi(String noFaktur, String namaPelanggan, String noHp, String namaBarang, double hargaBarang, int jumlahBeli) {
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.noHp = noHp;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.setJumlahBeli(jumlahBeli);
    }

    public void setJumlahBeli(int jumlahBeli) {
        if (jumlahBeli > 1000) {
            throw new IllegalArgumentException("Jumlah beli tidak boleh lebih dari 1000");
        }
        this.jumlahBeli = jumlahBeli;
    }

    public void tampilkanDetailTransaksi() {
        System.out.println("");
        System.out.println("DETAIL TRANSAKSI");
        System.out.println("No Faktur\t: " + noFaktur);
        System.out.println("Nama Pelanggan\t: " + namaPelanggan);
        System.out.println("No HP \t: " + noHp);
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Harga Barang\t: " + hargaBarang);
        System.out.println("Jumlah Beli\t: " + jumlahBeli);
    }
}
