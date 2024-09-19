public class MataKuliah {
    private String kodeMk;
    private String namaMk;
    private int sks;
    private Dosen dosenPengampu;

    public MataKuliah(String kodeMk, String namaMk, int sks, Dosen dosenPengampu) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    public String getNamaMk() {
        return namaMk;
    }

    public Dosen getDosenPengampu() {
        return dosenPengampu;
    }
}
