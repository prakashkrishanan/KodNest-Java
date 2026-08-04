public class PlacementEligibility {
    public static void main(String[] args) {
        int marks = 65;
        int attendance = 80;
        boolean projectCompleted = true;

        // Subtask 1
        boolean marksEligible = marks >= 60;

        // Subtask 2
        boolean attendanceEligible = attendance >= 75;

        // Subtask 3
        boolean academicEligible = marksEligible && attendanceEligible;

        // Subtask 4
        boolean placementEligible = academicEligible && projectCompleted;

        // Subtask 5
        System.out.println("Placement eligibility: " + placementEligible);
    }
}
