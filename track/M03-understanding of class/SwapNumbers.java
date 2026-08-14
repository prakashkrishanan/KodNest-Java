import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter two numbers to swap: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] swapped = swapNumbers(a, b);
            System.out.println("After Swap: a = " + swapped[0] + ", b = " + swapped[1]);
        }
    }

    static int[] swapNumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }
}
