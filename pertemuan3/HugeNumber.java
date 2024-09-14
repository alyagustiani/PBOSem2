import java.math.BigInteger;
import java.util.Scanner;

public class HugeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menampilkan petunjuk untuk memasukkan angka besar
        System.out.println("Masukkan angka pertama (maksimum 200 digit):");
        String a = sc.nextLine();

        System.out.println("Masukkan angka kedua (maksimum 200 digit):");
        String b = sc.nextLine();

        // Mengonversi string ke BigInteger
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);

        // Menjumlahkan dan mengalikan angka-angka tersebut
        BigInteger sum = num1.add(num2);
        BigInteger product = num1.multiply(num2);

        // Mencetak hasil
        System.out.println("Hasil penjumlahan:");
        System.out.println(sum);

        System.out.println("Hasil perkalian:");
        System.out.println(product);
    }
}
