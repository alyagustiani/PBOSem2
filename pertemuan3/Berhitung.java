import java.util.Scanner;

public class Berhitung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menampilkan petunjuk untuk memasukkan angka dan operator
        System.out.println("Masukkan angka pertama:");
        int A = sc.nextInt();   // Baca angka pertama

        System.out.println("Masukkan operator (+, -, *, /, %):");
        char operator = sc.next().charAt(0);   // Baca operator

        System.out.println("Masukkan angka kedua:");
        int B = sc.nextInt();   // Baca angka kedua

        // Variabel untuk menyimpan hasil operasi
        int hasil = 0;

        // Operasi sesuai dengan operator yang diberikan
        switch (operator) {
            case '+':
                hasil = A + B;
                break;
            case '-':
                hasil = A - B;
                break;
            case '*':
                hasil = A * B;
                break;
            case '/':
                hasil = A / B;  // Pembagian bulat
                break;
            case '%':
                hasil = A % B;
                break;
            default:
                System.out.println("Operator tidak valid");
                return; // Keluar dari program jika operator tidak valid
        }

        // Cetak hasil
        System.out.println("Hasil: " + hasil);
    }
}
