package studi_kasus_2;

public abstract class Shape {
    protected String shapeName;

    // Constructor to set the shape's name
    public Shape(String name) {
        shapeName = name;
    }

    // Abstract method to compute the area of the shape
    public abstract double area();

    // Returns the name of the shape as a string
    @Override
    public String toString() {
        return shapeName;
    }
}

