public class Desainer extends Pekerjaan implements Teknologi {
    private String alatDesain;

    public Desainer(String nama, int id, double gaji, String departemen, String alatDesain) {
        super(nama, id, gaji, departemen);
        this.alatDesain = alatDesain;
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " sedang mendesain menggunakan " + alatDesain);
    }

    @Override
    public void gunakanTeknologi() {
        System.out.println(nama + " menggunakan perangkat lunak desain grafis.");
    }
}
