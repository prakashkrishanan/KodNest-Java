import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of practice days
        int days = sc.nextInt();

        // Arrays for planned and completed counts
        int[] planned = new int[days];
        int[] completed = new int[days];

        // Read planned counts
        for (int i = 0; i < days; i++) {
            planned[i] = sc.nextInt();
        }

        // Read completed counts
        for (int i = 0; i < days; i++) {
            completed[i] = sc.nextInt();
        }

        // Compare and print status
        int completedDays = 0;
        for (int i = 0; i < days; i++) {
            if (completed[i] >= planned[i]) {
                System.out.println("Day " + (i + 1) + ": Completed");
                completedDays++;
            } else {
                System.out.println("Day " + (i + 1) + ": Pending");
            }
        }

        // Print total completed days
        System.out.println("Completed days: " + completedDays);
    }
}
