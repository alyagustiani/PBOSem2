package com.familygift;

import java.util.*;

public class Family {
    private final Map<String, Uncle> uncles; // Menggunakan Map untuk pencarian efisien
    private final Map<String, Niece> nieces;

    public Family() {
        uncles = new HashMap<>();
        nieces = new HashMap<>();
    }

    public boolean addNiece(String name, int day, int month) {
        if (findNiece(name) != null) {
            System.out.println("Peringatan: Keponakan dengan nama " + name + " sudah ada!");
            return false;
        }
        nieces.put(name.toLowerCase(), new Niece(name, day, month));
        System.out.println("Berhasil menambahkan keponakan: " + name);
        return true;
    }

    public boolean addUncle(String name) {
        if (findUncle(name) != null) {
            System.out.println("Peringatan: Paman dengan nama " + name + " sudah ada!");
            return false;
        }
        uncles.put(name.toLowerCase(), new Uncle(name));
        System.out.println("Berhasil menambahkan paman: " + name);
        return true;
    }

    public Niece findNiece(String name) {
        return nieces.get(name.toLowerCase());
    }

    public Uncle findUncle(String name) {
        return uncles.get(name.toLowerCase());
    }

    public void listNieces() {
        System.out.println("\nDaftar Keponakan (urut berdasarkan ulang tahun):");
        if (nieces.isEmpty()) {
            System.out.println("Belum ada keponakan yang terdaftar.");
        } else {
            nieces.values().stream()
                    .sorted()
                    .forEach(niece -> System.out.println(niece.getName()));
        }
    }

    public void listUncles() {
        System.out.println("\nDaftar Paman (urut alfabetis):");
        if (uncles.isEmpty()) {
            System.out.println("Belum ada paman yang terdaftar.");
        } else {
            uncles.values().stream()
                    .sorted()
                    .forEach(uncle -> System.out.println(uncle.getName()));
        }
    }

    // Method untuk testing
    public void generateSampleData() {
        // Menambahkan paman
        addUncle("Albert");
        addUncle("Bill");
        addUncle("Charlie");

        // Menambahkan keponakan
        addNiece("Amy", 15, 3);
        addNiece("Beatrice", 22, 6);
        addNiece("Claire", 10, 9);

        // Menambahkan beberapa hadiah
        Uncle albert = findUncle("Albert");
        Uncle bill = findUncle("Bill");
        Uncle charlie = findUncle("Charlie");

        Niece amy = findNiece("Amy");
        Niece beatrice = findNiece("Beatrice");
        Niece claire = findNiece("Claire");

        albert.addPresent(amy, "The Wonder of Computers");
        albert.addPresent(beatrice, "Programming Book");
        albert.addPresent(claire, "Art Kit");

        bill.addPresent(amy, "Painting Set");
        bill.addPresent(beatrice, "Science Kit");

        charlie.addPresent(claire, "Story Book");

        // Mencoba menambahkan hadiah duplikat
        bill.addPresent(claire, "Art Kit"); // Seharusnya gagal karena duplikat
    }
}
