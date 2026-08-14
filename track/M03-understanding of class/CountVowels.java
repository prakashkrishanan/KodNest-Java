import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string to count vowels: ");
            String vowelStr = sc.nextLine();
            System.out.println("Vowel Count: " + countVowels(vowelStr));
        }
    }

    static int countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }
}
