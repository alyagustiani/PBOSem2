public class Cylinder extends circle2 {
    private double height;

    // Constructor with default radius and height
    public Cylinder() {
        super();
        height = 1.0;
    }

    // Constructor with default radius, but given height
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    // Constructor with given radius and height
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Method untuk mendapatkan tinggi silinder
    public double getHeight() {
        return height;
    }

    // Override metode getArea() untuk menghitung luas permukaan silinder
    @Override
    public double getArea() {
        return 2 * Math.PI * radius * height + 2 * super.getArea();
    }

    // Metode untuk menghitung volume silinder
    public double getVolume() {
        return super.getArea() * height;
    }

    // Override toString() untuk memberikan representasi String dari Cylinder
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
