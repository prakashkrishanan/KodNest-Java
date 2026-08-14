import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of Fibonacci terms: ");
            int fibN = sc.nextInt();
            System.out.print("Fibonacci Series: ");
            fibonacci(fibN);
        }
    }

    static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + (i < n - 1 ? " " : ""));
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}
