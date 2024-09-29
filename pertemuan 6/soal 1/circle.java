public class circle { // Simpan sebagai "Circle.java"
    // Variabel instance private, tidak dapat diakses dari luar kelas ini
    private double radius;
    private String color;

    // Konstruktor (overloaded)
    /** Membuat sebuah instance Circle dengan nilai default untuk radius dan color */
    public circle() { // Konstruktor pertama (default)
        radius = 1.0;
        color = "red";
    }

    /** Membuat sebuah instance Circle dengan radius yang diberikan dan warna default */
    public circle(double r) { // Konstruktor kedua
        radius = r;
        color = "red";
    }

    /** Membuat sebuah instance Circle dengan radius dan warna yang diberikan */
    public circle(double r, String c) { // Konstruktor ketiga
        radius = r;
        color = c;
    }

    /** Mengembalikan nilai radius */
    public double getRadius() {
        return radius;
    }

    /** Mengembalikan area dari Circle ini */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Mengembalikan nilai warna dari Circle ini */
    public String getColor() {
        return color;
    }

    /** Mengatur nilai warna dari Circle ini */
    public void setColor(String color) {
        this.color = color;
    }

    /** Mengembalikan string deskripsi dari instance ini dalam bentuk Circle[radius=?,color=?] */
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
