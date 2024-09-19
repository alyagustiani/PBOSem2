// JadwalKuliah.java
public class JadwalKuliah {
    private String hari;
    private String waktu;
    private Ruangan ruangan;
    private Dosen dosen;

    public JadwalKuliah(String hari, String waktu, Ruangan ruangan, Dosen dosen) {
        this.hari = hari;
        this.waktu = waktu;
        this.ruangan = ruangan;
        this.dosen = dosen;
    }

    public String getHari() {
        return hari;
    }

    public String getWaktu() {
        return waktu;
    }

    public Ruangan getRuangan() {
        return ruangan;
    }

    public Dosen getDosen() {
        return dosen;
    }

    @Override
    public String toString() {
        return "Hari: " + hari + ", Waktu: " + waktu + ", Ruangan: " + ruangan + ", Dosen: " + dosen;
    }
}
