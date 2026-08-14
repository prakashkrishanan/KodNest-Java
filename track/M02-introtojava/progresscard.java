import java.util.Scanner;

class Learner {
    int registrationId;
    String name;
    double attendancePercentage;
}

public class progresscard {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create and populate first student
        Learner first = new Learner();
        first.registrationId = scanner.nextInt();
        first.name = scanner.next();
        first.attendancePercentage = scanner.nextDouble();

        // Create and populate second student
        Learner second = new Learner();
        second.registrationId = scanner.nextInt();
        second.name = scanner.next();
        second.attendancePercentage = scanner.nextDouble();

        // Read selected ID and new attendance
        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        // Reference to the selected existing object
        Learner selectedStudent = null;

        if (selectedId == first.registrationId) {
            selectedStudent = first;
        } else if (selectedId == second.registrationId) {
            selectedStudent = second;
        }

        // Update through selectedStudent
        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendance;

            System.out.println("Selected Student: " + selectedStudent.name);
            System.out.println(first.registrationId + " - " + first.name + " - " 
                    + first.attendancePercentage + "%");
            System.out.println(second.registrationId + " - " + second.name + " - " 
                    + second.attendancePercentage + "%");
        } else {
            System.out.println("Student not found.");
            System.out.println(first.registrationId + " - " + first.name + " - " 
                    + first.attendancePercentage + "%");
            System.out.println(second.registrationId + " - " + second.name + " - " 
                    + second.attendancePercentage + "%");
        }

        scanner.close();
    }
}