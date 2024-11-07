public class GenericsMethods {

    // Java Generic Method
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
        return g1.get().equals(g2.get());
    }

    public static void main(String args[]) {
        // Membuat objek GenericsType dengan tipe String
        GenericsType<String> g1 = new GenericsType<>();
        g1.set("Java");

        GenericsType<String> g2 = new GenericsType<>();
        g2.set("Java");

        // Memanggil metode generik dengan eksplisit tipe parameter
        boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);

        // Panggilan yang sama tanpa menyebutkan tipe parameter, compiler akan melakukan type inference
        isEqual = GenericsMethods.isEqual(g1, g2);

        System.out.println("Apakah g1 dan g2 sama? " + isEqual);
    }
}
