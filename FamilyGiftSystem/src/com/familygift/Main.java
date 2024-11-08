package com.familygift;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();

        // Generate sampel data
        family.generateSampleData();

        // Menampilkan semua data
        family.listUncles();
        family.listNieces();

        // Menampilkan hadiah dari setiap paman
        Uncle albert = family.findUncle("Albert");
        Uncle bill = family.findUncle("Bill");
        Uncle charlie = family.findUncle("Charlie");

        if (albert != null) albert.listPresents();
        if (bill != null) bill.listPresents();
        if (charlie != null) charlie.listPresents();

        // Menampilkan hadiah untuk setiap keponakan
        Niece amy = family.findNiece("Amy");
        Niece beatrice = family.findNiece("Beatrice");
        Niece claire = family.findNiece("Claire");

        if (amy != null) amy.listPresents();
        if (beatrice != null) beatrice.listPresents();
        if (claire != null) claire.listPresents();
    }
}
