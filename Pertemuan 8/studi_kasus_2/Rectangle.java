package studi_kasus_2;

public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to set the dimensions and name
    public Rectangle(double l, double w) {
        super("Rectangle");
        length = l;
        width = w;
    }

    // Method to compute the area of the rectangle
    @Override
    public double area() {
        return length * width;
    }

    // Returns a string representation of the rectangle
    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}

