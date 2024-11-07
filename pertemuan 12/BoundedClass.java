// Kelas Bound dengan tipe parameter yang dibatasi pada kelas A atau turunannya
class Bound<T extends A> {
    private T objRef;

    // Konstruktor untuk menginisialisasi objRef
    public Bound(T obj) {
        this.objRef = obj;
    }

    // Metode untuk menjalankan tes yang memanggil displayClass dari objRef
    public void doRunTest() {
        this.objRef.displayClass();
    }
}

// Kelas A (superclass)
class A {
    public void displayClass() {
        System.out.println("Inside super class A");
    }
}

// Kelas B yang merupakan subclass dari A
class B extends A {
    @Override
    public void displayClass() {
        System.out.println("Inside sub class B");
    }
}

// Kelas C yang juga merupakan subclass dari A
class C extends A {
    @Override
    public void displayClass() {
        System.out.println("Inside sub class C");
    }
}

// Kelas utama untuk menjalankan program
public class BoundedClass {
    public static void main(String[] args) {

        // Membuat objek dari subclass C dan melewatkannya ke Bound sebagai parameter tipe
        Bound<C> bec = new Bound<>(new C());
        bec.doRunTest(); // Output: Inside sub class C

        // Membuat objek dari subclass B dan melewatkannya ke Bound sebagai parameter tipe
        Bound<B> beb = new Bound<>(new B());
        beb.doRunTest(); // Output: Inside sub class B

        // Membuat objek dari superclass A dan melewatkannya ke Bound sebagai parameter tipe
        Bound<A> bea = new Bound<>(new A());
        bea.doRunTest(); // Output: Inside super class A
    }
}

