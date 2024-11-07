package com.familygift;

import java.util.*;

public class Niece implements Comparable<Niece> {
    private final String name;
    private final int day;
    private final int month;
    private final Set<Present> presents; // Menggunakan Set untuk menghindari duplikasi

    Niece(String name, int day, int month) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.presents = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPresent(Present present) {
        return presents.add(present);
    }

    public Set<Present> getPresents() {
        return Collections.unmodifiableSet(presents);
    }

    public int clearPresents() {
        int count = presents.size();
        presents.clear();
        return count;
    }

    public void listPresents() {
        System.out.println("\nDaftar hadiah untuk " + name + ":");
        if (presents.isEmpty()) {
            System.out.println("Belum ada hadiah.");
        } else {
            presents.stream()
                    .sorted(Comparator.comparing(p -> p.getGiver().getName()))
                    .forEach(present -> System.out.println("Dari " + present.getGiver().getName() +
                            ": " + present.getDescription()));
        }
    }

    @Override
    public int compareTo(Niece other) {
        return Comparator.comparingInt((Niece n) -> n.month)
                .thenComparingInt(n -> n.day)
                .compare(this, other);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Niece niece = (Niece) o;
        return Objects.equals(name, niece.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
