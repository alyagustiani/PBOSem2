package studi_kasus_2;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor to set the dimensions and name
    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    // Method to compute the surface area of the cylinder
    @Override
    public double area() {
        return Math.PI * radius * radius * height;
    }

    // Returns a string representation of the cylinder
    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}

