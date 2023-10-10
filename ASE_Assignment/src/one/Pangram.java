package one;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        boolean isPangram = checkIfPangram(input);

        if (isPangram) {
            System.out.println("It's a pangram!");
        } else {
            System.out.println("It's not a pangram.");
        }

        scanner.close();
    }

    private static boolean checkIfPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();

        for (char c : sentence.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }

        return alphabetSet.size() == 26;
    }
}

