import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string to count characters: ");
            String charStr = sc.nextLine();
            System.out.println("Character Count: " + countCharacters(charStr));
        }
    }

    static int countCharacters(String s) {
        return s.length();
    }
}
