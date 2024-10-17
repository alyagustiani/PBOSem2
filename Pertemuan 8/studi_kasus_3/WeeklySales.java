package studi_kasus_3;

import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah penjual: ");
        int numSalespeople = scan.nextInt();
        Salesperson[] salesStaff = new Salesperson[numSalespeople];

        // Memasukkan data penjual
        for (int i = 0; i < numSalespeople; i++) {
            System.out.print("Masukkan nama depan: ");
            String firstName = scan.next();
            System.out.print("Masukkan nama belakang: ");
            String lastName = scan.next();
            System.out.print("Masukkan total penjualan: ");
            int totalSales = scan.nextInt();

            salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
        }

        // Mengurutkan penjual
        Sorting.insertionSort(salesStaff);

        // Menampilkan hasil pengurutan
        System.out.println("\nRanking Penjualan untuk Minggu Ini\n");

        for (Salesperson s : salesStaff) {
            System.out.println(s);
        }
    }
}


