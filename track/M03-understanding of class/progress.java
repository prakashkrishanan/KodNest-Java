import java.util.Scanner;

class StudentProgress {
    String name;
    int completedLessons;
    int totalLessons;
    int percentage;
}

public class progress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create one StudentProgress object
        StudentProgress progress = new StudentProgress();

        // Read and store name, completed lessons, and total lessons
        progress.name = scanner.next();
        progress.completedLessons = scanner.nextInt();
        progress.totalLessons = scanner.nextInt();

        // Calculate and store the completion percentage
        progress.percentage = progress.completedLessons * 100 / progress.totalLessons;

        // Print the progress card
        System.out.println("Student: " + progress.name);
        System.out.println("Progress: " + progress.completedLessons + "/" + progress.totalLessons);
        System.out.println("Completion: " + progress.percentage + "%");

        scanner.close();
    }
}
