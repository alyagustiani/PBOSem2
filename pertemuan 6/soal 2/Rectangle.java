public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    // Konstruktor tanpa argumen
    public Rectangle() {}

    // Konstruktor dengan parameter width dan length
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Konstruktor dengan parameter width, length, color, dan filled
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter untuk width
    public double getWidth() {
        return width;
    }

    // Setter untuk width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter untuk length
    public double getLength() {
        return length;
    }

    // Setter untuk length
    public void setLength(double length) {
        this.length = length;
    }

    // Metode untuk menghitung luas
    public double getArea() {
        return width * length;
    }

    // Metode untuk menghitung keliling
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override toString()
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}
