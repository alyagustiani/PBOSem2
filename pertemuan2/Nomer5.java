import java.util.Scanner;

public class Nomer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input strings
        String A = sc.next();
        String B = sc.next();

        // 1. Sum the lengths of A and B
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // 2. Determine if A is lexicographically larger than B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Capitalize the first letter of A and B and print them
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(capitalizedA + " " + capitalizedB);
    }
}
