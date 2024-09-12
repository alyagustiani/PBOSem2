package com.polban.jtk.sales;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk membuat object Product
        System.out.print("Masukkan nama produk: ");
        String productName = scanner.nextLine();

        System.out.print("Masukkan harga produk: ");
        double price = scanner.nextDouble();

        System.out.print("Masukkan jumlah stok awal: ");
        int stock = scanner.nextInt();

        // Membuat object product berdasarkan input pengguna
        Product product = new Product(productName, price, stock);

        // Membuat object sales
        Sales sales = new Sales(product);

        // Penjualan produk
        System.out.print("Masukkan jumlah produk yang dijual: ");
        int quantitySold = scanner.nextInt();
        sales.sellProduct(quantitySold);

        // Restock produk
        System.out.print("Masukkan jumlah stok yang ingin ditambahkan: ");
        int quantityRestock = scanner.nextInt();
        sales.restockProduct(quantityRestock);

        // Memperbarui harga produk
        System.out.print("Masukkan harga baru: ");
        double newPrice = scanner.nextDouble();
        sales.updateProductPrice(newPrice);

        // Coba memperbarui harga produk dengan nilai negatif (menguji validasi)
        System.out.print("Masukkan harga baru (negatif untuk menguji validasi): ");
        double invalidPrice = scanner.nextDouble();
        sales.updateProductPrice(invalidPrice);

        scanner.close();
    }
}
