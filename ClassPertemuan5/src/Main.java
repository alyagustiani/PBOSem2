import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        D3TI d3ti = new D3TI();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        // Menambahkan beberapa jadwal kuliah untuk opsi jadwal langsung
        Ruangan ruangan1 = new Ruangan("Lab Komputer A");
        d3ti.tambahJadwalKuliah(new JadwalKuliah("Senin", "08:00-10:00", ruangan1, new Dosen("Dr. Iqbal", "10001")));
        d3ti.tambahJadwalKuliah(new JadwalKuliah("Selasa", "10:00-12:00", new Ruangan("Lab Komputer B"), new Dosen("Dr. Sri", "10002")));

        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tambah Dosen");
            System.out.println("3. Tampilkan Data Mahasiswa");
            System.out.println("4. Tampilkan Data Dosen");
            System.out.println("5. Tampilkan Jadwal Kuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah mahasiswa yang ingin ditambahkan: ");
                    int jumlahMahasiswa = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan buffer
                    for (int i = 0; i < jumlahMahasiswa; i++) {
                        System.out.println("Mahasiswa " + (i + 1) + ":");
                        System.out.print("Masukkan nama mahasiswa: ");
                        String namaMahasiswa = scanner.nextLine();
                        System.out.print("Masukkan NIM mahasiswa: ");
                        String nimMahasiswa = scanner.nextLine();
                        d3ti.tambahMahasiswa(new Mahasiswa(namaMahasiswa, nimMahasiswa));
                    }
                    System.out.println(jumlahMahasiswa + " mahasiswa berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan jumlah dosen yang ingin ditambahkan: ");
                    int jumlahDosen = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan buffer
                    for (int i = 0; i < jumlahDosen; i++) {
                        System.out.println("Dosen " + (i + 1) + ":");
                        System.out.print("Masukkan nama dosen: ");
                        String namaDosen = scanner.nextLine();
                        System.out.print("Masukkan NIDN dosen: ");
                        String nidnDosen = scanner.nextLine();
                        d3ti.tambahDosen(new Dosen(namaDosen, nidnDosen));
                    }
                    System.out.println(jumlahDosen + " dosen berhasil ditambahkan.");
                    break;
                case 3:
                    d3ti.tampilkanMahasiswa();
                    break;
                case 4:
                    d3ti.tampilkanDosen();
                    break;
                case 5:
                    d3ti.tampilkanJadwalKuliah();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
