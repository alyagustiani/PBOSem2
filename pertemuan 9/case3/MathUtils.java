package case3;

public class MathUtils {
    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial tidak didefinisikan untuk angka negatif");
        }
        if (n > 16) {
            throw new IllegalArgumentException("Factorial hanya bisa dihitung sampai 16 karena keterbatasan tipe data int");
        }

        int fac = 1;
        for (int i=n; i>0; i--)
            fac *= i;
        return fac;
    }
}
