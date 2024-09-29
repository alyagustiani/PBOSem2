public class Square extends Rectangle {

    // Konstruktor dengan parameter side
    public Square(double side) {
        super(side, side); // Panggil konstruktor Rectangle dengan width=side dan length=side
    }

    // Konstruktor dengan parameter side, color, dan filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter untuk side
    public double getSide() {
        return getWidth(); // Karena width dan length harus sama pada Square
    }

    // Setter untuk side
    public void setSide(double side) {
        setWidth(side);
        setLength(side); // Pastikan kedua atribut sama
    }

    // Override setWidth() untuk menjaga properti Square
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override setLength() untuk menjaga properti Square
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // Override toString()
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
