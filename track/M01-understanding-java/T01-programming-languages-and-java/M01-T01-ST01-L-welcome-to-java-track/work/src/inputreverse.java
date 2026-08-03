
import java.util.Scanner;

public class inputreverse {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Input Number
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int originalNum = num;
            int reverseNum = 0;

            while (num != 0) {
                int digit = num % 10;
                reverseNum = reverseNum * 10 + digit;
                num = num / 10;
            }

            System.out.println("Original Number : " + originalNum);
            System.out.println("Reversed Number : " + reverseNum);

            // Input String
            System.out.print("Enter a string: ");
            sc.nextLine(); // Consume leftover newline
            String str = sc.nextLine();

            String reverseStr = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reverseStr = reverseStr + str.charAt(i);
            }

            System.out.println("Original String : " + str);
            System.out.println("Reversed String : " + reverseStr);
        }
    }
}
