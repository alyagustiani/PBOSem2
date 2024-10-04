public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Andi", 101, 8000000, "IT", "Java");
        Desainer desainer = new Desainer("Budi", 102, 7000000, "Desain", "Photoshop");

        programmer.bekerja();
        programmer.gunakanTeknologi();

        System.out.println();

        desainer.bekerja();
        desainer.gunakanTeknologi();
    }
}
