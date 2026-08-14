import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sentence to count words: ");
            String sentence = sc.nextLine();
            System.out.println("Word Count: " + countWords(sentence));
        }
    }

    static int countWords(String s) {
        String trimmed = s.trim();
        if (trimmed.isEmpty()) return 0;
        return trimmed.split("\\s+").length;
    }
}
