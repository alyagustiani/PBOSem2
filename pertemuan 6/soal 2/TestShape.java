public class TestShape {
    public static void main(String[] args) {
        // Menguji kelas Shape
        Shape shape1 = new Shape(); // Menggunakan konstruktor tanpa argumen
        System.out.println(shape1); // Output: "A Shape with color of green and filled"

        Shape shape2 = new Shape("blue", false); // Konstruktor dengan parameter
        System.out.println(shape2); // Output: "A Shape with color of blue and Not filled"

        // Menguji kelas circle3
        circle3 circle1 = new circle3(); // Konstruktor tanpa argumen
        System.out.println(circle1); // Output: "A Circle with radius=1.0, which is a subclass of A Shape with color of green and filled"
        circle3 circle2 = new circle3(2.5); // Konstruktor dengan radius
        System.out.println(circle2); // Output: "A Circle with radius=2.5, which is a subclass of A Shape with color of green and filled"
        circle3 circle3 = new circle3(3.5, "yellow", true); // Konstruktor lengkap
        System.out.println(circle3); // Output: "A Circle with radius=3.5, which is a subclass of A Shape with color of yellow and filled"
        System.out.println("Area of circle3: " + circle3.getArea()); // Luas lingkaran
        System.out.println("Perimeter of circle3: " + circle3.getPerimeter()); // Keliling lingkaran

        // Menguji kelas Rectangle
        Rectangle rectangle1 = new Rectangle(); // Konstruktor tanpa argumen
        System.out.println(rectangle1); // Output: "A Rectangle with width=1.0 and length=1.0, which is a subclass of A Shape with color of green and filled"
        Rectangle rectangle2 = new Rectangle(2.0, 4.0); // Konstruktor dengan width dan length
        System.out.println(rectangle2); // Output: "A Rectangle with width=2.0 and length=4.0, which is a subclass of A Shape with color of green and filled"
        Rectangle rectangle3 = new Rectangle(3.0, 6.0, "red", false); // Konstruktor lengkap
        System.out.println(rectangle3); // Output: "A Rectangle with width=3.0 and length=6.0, which is a subclass of A Shape with color of red and Not filled"
        System.out.println("Area of rectangle3: " + rectangle3.getArea()); // Luas persegi panjang
        System.out.println("Perimeter of rectangle3: " + rectangle3.getPerimeter()); // Keliling persegi panjang

        // Menguji kelas Square
        Square square1 = new Square(2.0); // Konstruktor dengan parameter side
        System.out.println(square1); // Output: "A Square with side=2.0, which is a subclass of A Rectangle with width=2.0 and length=2.0, which is a subclass of A Shape with color of green and filled"
        square1.setSide(3.0); // Mengubah nilai side
        System.out.println("Updated " + square1); // Output: "A Square with side=3.0, which is a subclass of A Rectangle with width=3.0 and length=3.0, which is a subclass of A Shape with color of green and filled"
        square1.setWidth(4.0); // Mengubah width, seharusnya length ikut berubah
        System.out.println("After setting width: " + square1); // Output: "A Square with side=4.0, which is a subclass of A Rectangle with width=4.0 and length=4.0, which is a subclass of A Shape with color of green and filled"
        square1.setLength(5.0); // Mengubah length, seharusnya width ikut berubah
        System.out.println("After setting length: " + square1); // Output: "A Square with side=5.0, which is a subclass of A Rectangle with width=5.0 and length=5.0, which is a subclass of A Shape with color of green and filled"
    }
}
