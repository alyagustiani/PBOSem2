import java.util.Scanner;

public class BukaTutupJalan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menampilkan petunjuk untuk memasukkan plat nomor mobil
        System.out.println("Masukkan plat nomor untuk 4 mobil (misal: 3555 2333 4555 6660):");

        // Membaca input plat nomor
        String plat1 = sc.next();
        String plat2 = sc.next();
        String plat3 = sc.next();
        String plat4 = sc.next();

        // Gabungkan plat nomor menjadi satu string
        String gabungan = plat1 + plat2 + plat3 + plat4;

        // Ubah gabungan menjadi integer
        long gabunganAngka = Long.parseLong(gabungan);

        // Hitung hasil dan periksa sisa bagi
        long hasil = gabunganAngka - 999999;
        if (hasil % 5 == 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}
