public class circle3 extends Shape {
    private double radius = 1.0;

    // Konstruktor tanpa argumen
    public circle3() {}

    // Konstruktor dengan parameter radius
    public circle3(double radius) {
        this.radius = radius;
    }

    // Konstruktor dengan parameter radius, color, dan filled
    public circle3(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter untuk radius
    public double getRadius() {
        return radius;
    }

    // Setter untuk radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Metode untuk menghitung luas lingkaran
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Metode untuk menghitung keliling lingkaran
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override toString()
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
