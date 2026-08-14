import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            System.out.println("Reversed String: " + reverseString(str));
        }
    }

    static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
