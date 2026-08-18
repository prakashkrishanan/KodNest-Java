import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of 5 integers
        int[] numbers = new int[5];

        // Read 5 integers from input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Calculate total
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        // Print result
        System.out.println("Total: " + total);
    }
}
