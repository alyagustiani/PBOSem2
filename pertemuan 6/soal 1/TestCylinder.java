public class TestCylinder {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi silinder dengan radius dan height default
        Cylinder c1 = new Cylinder();
        System.out.println(c1.toString()); // Mencetak representasi objek c1
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());

        // Deklarasi dan inisialisasi silinder dengan tinggi 10 dan radius default
        Cylinder c2 = new Cylinder(10.0);
        System.out.println(c2.toString()); // Mencetak representasi objek c2
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());

        // Deklarasi dan inisialisasi silinder dengan radius 2.0 dan height 10.0
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println(c3.toString()); // Mencetak representasi objek c3
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());
    }
}
