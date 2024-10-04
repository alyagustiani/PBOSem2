public class Programmer extends Pekerjaan implements Teknologi {
    private String bahasaPemrograman;

    public Programmer(String nama, int id, double gaji, String departemen, String bahasaPemrograman) {
        super(nama, id, gaji, departemen);
        this.bahasaPemrograman = bahasaPemrograman;
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " sedang menulis kode dengan bahasa " + bahasaPemrograman);
    }

    @Override
    public void gunakanTeknologi() {
        System.out.println(nama + " menggunakan IDE dan alat pengembangan lainnya.");
    }
}
