package com.polban.jtk.inventory;

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok; // Ubah menjadi private

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    // Getter untuk stok
    public int getStok() {
        return stok;
    }

    // Hanya metode ini yang bisa menambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) { // Pastikan hanya bisa menambah stok jika jumlah positif
            stok += jumlah;
        } else {
            System.out.println("Jumlah penambahan stok tidak valid!");
        }
    }
}
