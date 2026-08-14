import java.util.Scanner;

class StudentUtility {
    // Method 1: Print report title
    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    // Method 2: Display student ID and name
    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    // Method 3: Return passing percentage
    double getPassingPercentage() {
        return 60.0;
    }

    // Method 4: Calculate average percentage
    double calculatePercentage(int javaScore, int sqlScore) {
        return (javaScore + sqlScore) / 2.0;
    }
}

public class meth1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentUtility utility = new StudentUtility();

        // Read input
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        String name = scanner.nextLine();
        int javaScore = scanner.nextInt();
        int sqlScore = scanner.nextInt();

        // Call methods
        utility.showReportTitle();
        utility.displayStudent(id, name);

        double passingPercentage = utility.getPassingPercentage();
        double averagePercentage = utility.calculatePercentage(javaScore, sqlScore);

        // Display results
        System.out.println("Percentage: " + averagePercentage);

        if (averagePercentage >= passingPercentage) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: NEEDS IMPROVEMENT");
        }

        scanner.close();
    }
}
