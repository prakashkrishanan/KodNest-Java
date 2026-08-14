import java.util.Scanner;

class ResultCalculator {
    // Method to calculate total of two marks
    int getTotal(int first, int second) {
        return first + second;
    }

    // Overloaded method to calculate total of three marks
    int getTotal(int first, int second, int third) {
        return first + second + third;
    }
}

public class rescal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three marks
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        // Create ResultCalculator object
        ResultCalculator calculator = new ResultCalculator();

        // Call both overloaded methods
        int twoMarkTotal = calculator.getTotal(first, second);
        int threeMarkTotal = calculator.getTotal(first, second, third);

        // Print results
        System.out.println("Two-Mark Total: " + twoMarkTotal);
        System.out.println("Three-Mark Total: " + threeMarkTotal);
    }
}
