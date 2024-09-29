public class circle2 {
    protected double radius;

    // Konstruktor default
    public circle2() {
        radius = 1.0;
    }

    // Konstruktor dengan parameter radius
    public circle2(double radius) {
        this.radius = radius;
    }

    // Metode getArea() pada Circle
    public double getArea() {
        return radius * radius * Math.PI; // Menghitung luas lingkaran (π * r^2)
    }

    // Metode untuk mendapatkan radius
    public double getRadius() {
        return radius;
    }
}
