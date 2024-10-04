public abstract class Pekerjaan {
    protected String nama;
    protected int id;
    protected double gaji;
    protected String departemen;

    public Pekerjaan(String nama, int id, double gaji, String departemen) {
        this.nama = nama;
        this.id = id;
        this.gaji = gaji;
        this.departemen = departemen;
    }

    public abstract void bekerja();
}
