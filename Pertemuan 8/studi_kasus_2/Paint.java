package studi_kasus_2;

public class Paint {
    private double coverage;  // number of square feet per gallon

    // Constructor to set up the paint object
    public Paint(double c) {
        coverage = c;
    }

    // Returns the amount of paint needed to paint the shape
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / coverage;
    }
}


