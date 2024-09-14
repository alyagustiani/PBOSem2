import java.util.Scanner;

public class GajiAgen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menampilkan petunjuk untuk memasukkan jumlah penjualan
        System.out.println("Masukkan jumlah penjualan bulan ini:");

        // Baca jumlah penjualan
        int jumlahPenjualan = sc.nextInt();

        // Konstanta
        final int GAJI_POKOK = 500000;
        final int HARGA_ITEM = 50000;
        final double BONUS_10PERCENT = 0.10;
        final double BONUS_25PERCENT = 0.25;
        final double BONUS_35PERCENT = 0.35;
        final double DENDA_15PERCENT = 0.15;
        final int MINIMAL_JUMLAH_PENJUALAN_BONUS_25 = 40;
        final int MINIMAL_JUMLAH_PENJUALAN_BONUS_35 = 80;
        final int BATAS_MINIMAL_PENJUALAN_DENDA = 15;

        // Hitung total penjualan
        double totalPenjualan = jumlahPenjualan * HARGA_ITEM;

        // Hitung bonus per item
        double bonusPerItem = jumlahPenjualan * HARGA_ITEM * BONUS_10PERCENT;

        // Hitung bonus penjualan
        double bonusPenjualan = 0;
        if (jumlahPenjualan >= MINIMAL_JUMLAH_PENJUALAN_BONUS_35) {
            bonusPenjualan = totalPenjualan * BONUS_35PERCENT;
        } else if (jumlahPenjualan >= MINIMAL_JUMLAH_PENJUALAN_BONUS_25) {
            bonusPenjualan = totalPenjualan * BONUS_25PERCENT;
        }

        // Hitung denda
        double denda = 0;
        if (jumlahPenjualan < BATAS_MINIMAL_PENJUALAN_DENDA) {
            int kekuranganPenjualan = BATAS_MINIMAL_PENJUALAN_DENDA - jumlahPenjualan;
            denda = kekuranganPenjualan * HARGA_ITEM * DENDA_15PERCENT;
        }

        // Hitung gaji akhir
        double gajiAkhir = GAJI_POKOK + bonusPerItem + bonusPenjualan - denda;

        // Cetak gaji akhir
        System.out.println("Gaji akhir yang diterima: " + (int) gajiAkhir);
    }
}
