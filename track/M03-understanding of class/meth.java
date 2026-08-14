import java.util.Scanner;

class Student {
    String name;

    // Method to set name
    void setName(String name) {
        this.name = name;
    }

    // Method to show name
    void showName() {
        System.out.println("Student Name: " + name);
    }

    // Overloaded method: show one score
    void showScore(int first) {
        System.out.println("First Score: " + first);
    }

    // Overloaded method: show total of two scores
    void showScore(int first, int second) {
        System.out.println("Two-Score Total: " + (first + second));
    }
}

public class meth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read full name (two words)
        String fullName = scanner.nextLine();
        int firstScore = scanner.nextInt();
        int secondScore = scanner.nextInt();

        // Create Student object
        Student student = new Student();
        student.setName(fullName);

        // Print name and scores
        student.showName();
        student.showScore(firstScore);
        student.showScore(firstScore, secondScore);
    }
}
