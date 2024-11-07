package com.familygift;

import java.util.*;

public class Uncle implements Comparable<Uncle> {
    private final String name;
    private final Set<Present> presents; // Menggunakan Set untuk menghindari duplikasi

    Uncle(String name) {
        this.name = name;
        this.presents = new HashSet<>();
    }

    public String getName() { return name; }

    public boolean addPresent(Niece recipient, String description) {
        // Validasi hadiah duplikat
        boolean isDuplicateGift = presents.stream()
                .anyMatch(p -> p.getDescription().equalsIgnoreCase(description));

        boolean isDuplicateReceived = recipient.getPresents().stream()
                .anyMatch(p -> p.getDescription().equalsIgnoreCase(description));

        if (isDuplicateGift || isDuplicateReceived) {
            System.out.println("Peringatan: Hadiah duplikat tidak diperbolehkan!");
            return false;
        }

        Present present = new Present(this, recipient, description);
        presents.add(present);
        recipient.addPresent(present);
        return true;
    }

    public void listPresents() {
        System.out.println("\nDaftar hadiah dari " + name + ":");
        if (presents.isEmpty()) {
            System.out.println("Belum memberikan hadiah.");
        } else {
            presents.stream()
                    .sorted(Comparator.comparing(p -> p.getRecipient().getName()))
                    .forEach(present -> System.out.println("Untuk " + present.getRecipient().getName() +
                            ": " + present.getDescription()));
        }
    }

    @Override
    public int compareTo(Uncle other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uncle uncle = (Uncle) o;
        return Objects.equals(name, uncle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
