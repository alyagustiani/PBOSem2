import java.math.BigInteger;
import java.util.Scanner;

public class dataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Masukkan angka (atau ketik 'exit' untuk keluar): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program dihentikan.");
                break; // Keluar dari loop jika pengguna mengetik 'exit'
            }

            try {
                BigInteger angkaDataType = new BigInteger(input); // Mengubah String menjadi BigInteger

                // Variabel untuk menyimpan jenis data
                String jenisDataType = "";

                // Cek rentang dan tentukan jenis data
                if (angkaDataType.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                        angkaDataType.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                    jenisDataType += "* byte\n";
                }
                if (angkaDataType.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                        angkaDataType.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                    jenisDataType += "* short\n";
                }
                if (angkaDataType.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                        angkaDataType.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                    jenisDataType += "* int\n";
                }
                if (angkaDataType.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                        angkaDataType.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                    jenisDataType += "* long\n";
                }

                // Output the result
                System.out.println("Angka: " + angkaDataType);
                if (!jenisDataType.isEmpty()) {
                    System.out.println("Dapat disimpan dalam jenis data: ");
                    System.out.println(jenisDataType);
                } else {
                    System.out.println("Angka ini tidak dapat disimpan dalam jenis data manapun.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Pastikan Anda memasukkan angka yang benar.");
            }
        }
        scanner.close();
    }
}
