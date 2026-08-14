 import java.util.*;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to find duplicates: ");
        String s = sc.nextLine();

        Set<Character> seen = new HashSet<>();
        Set<Character> dup = new LinkedHashSet<>();

        for (char c : s.toCharArray()) {
            if (!seen.add(c)) dup.add(c);
        }

        System.out.println("Duplicate Characters: " + dup);
        sc.close();
    }
}