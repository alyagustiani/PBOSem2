package case1;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();
        word = word.toUpperCase();

        // Menambahkan try-catch untuk menangani karakter non-huruf
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i)-'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Menampilkan pesan untuk karakter yang bukan huruf
                System.out.println("Bukan huruf: " + word.charAt(i));
            }
        }

        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char)(i +'A') + ": " + counts[i]);
            }
        }
    }
}
