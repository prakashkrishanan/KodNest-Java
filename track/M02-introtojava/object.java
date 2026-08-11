import java.util.Scanner;

class Learner {
    int id;
    String name;
    int javaScore;
}

public class object {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create and populate the first Learner object
        Learner first = new Learner();
        first.id = scanner.nextInt();
        first.name = scanner.next();
        first.javaScore = scanner.nextInt();

        // Create and populate the second Learner object
        Learner second = new Learner();
        second.id = scanner.nextInt();
        second.name = scanner.next();
        second.javaScore = scanner.nextInt();

        // Read the new score
        int newScore = scanner.nextInt();

        // Display both records before the update
        System.out.println("Before Update");
        System.out.println(first.id + " - " + first.name + " - " + first.javaScore);
        System.out.println(second.id + " - " + second.name + " - " + second.javaScore);

        // Update only the first object
        first.javaScore = newScore;

        // Display both records after the update
        System.out.println("After Update");
        System.out.println(first.id + " - " + first.name + " - " + first.javaScore);
        System.out.println(second.id + " - " + second.name + " - " + second.javaScore);

        scanner.close();
    }
}