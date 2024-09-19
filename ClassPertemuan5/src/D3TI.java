import java.util.ArrayList;

public class D3TI extends JTK {
    private ArrayList<Mahasiswa> daftarMahasiswa;
    private ArrayList<Dosen> daftarDosen;
    private ArrayList<JadwalKuliah> jadwalKuliah;

    public D3TI() {
        daftarMahasiswa = new ArrayList<>();
        daftarDosen = new ArrayList<>();
        jadwalKuliah = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    public void tambahDosen(Dosen dosen) {
        daftarDosen.add(dosen);
    }

    public void tambahJadwalKuliah(JadwalKuliah jadwal) {
        jadwalKuliah.add(jadwal);
    }

    // Menampilkan data mahasiswa dalam bentuk tabel
    public void tampilkanMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }
        System.out.println("\nDaftar Mahasiswa:");
        System.out.println("+----------------------+-----------------+");
        System.out.printf("| %-20s | %-15s |\n", "Nama", "NIM");
        System.out.println("+----------------------+-----------------+");
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.printf("| %-20s | %-15s |\n", mhs.getNama(), mhs.getNim());
        }
        System.out.println("+----------------------+-----------------+");
    }

    // Menampilkan data dosen dalam bentuk tabel
    public void tampilkanDosen() {
        if (daftarDosen.isEmpty()) {
            System.out.println("Tidak ada data dosen.");
            return;
        }
        System.out.println("\nDaftar Dosen:");
        System.out.println("+----------------------+-----------------+");
        System.out.printf("| %-20s | %-15s |\n", "Nama", "NIDN");
        System.out.println("+----------------------+-----------------+");
        for (Dosen dosen : daftarDosen) {
            System.out.printf("| %-20s | %-15s |\n", dosen.getNama(), dosen.getNidn());
        }
        System.out.println("+----------------------+-----------------+");
    }

    // Menampilkan jadwal kuliah dalam bentuk tabel
    public void tampilkanJadwalKuliah() {
        if (jadwalKuliah.isEmpty()) {
            System.out.println("Tidak ada jadwal kuliah.");
            return;
        }
        System.out.println("\nJadwal Kuliah:");
        System.out.println("+------------+------------+----------------------+----------------------+");
        System.out.printf("| %-10s | %-10s | %-20s | %-20s |\n", "Hari", "Waktu", "Ruangan", "Dosen Pengampu");
        System.out.println("+------------+------------+----------------------+----------------------+");
        for (JadwalKuliah jadwal : jadwalKuliah) {
            System.out.printf("| %-10s | %-10s | %-20s | %-20s |\n",
                    jadwal.getHari(), jadwal.getWaktu(), jadwal.getRuangan(), jadwal.getDosen().getNama());
        }
        System.out.println("+------------+------------+----------------------+----------------------+");
    }
}
