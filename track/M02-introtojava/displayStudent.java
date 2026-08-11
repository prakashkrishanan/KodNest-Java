 class StudentUtility {
    // Type 1 — No Parameters and No Return Value
    void showPortalTitle() {
        System.out.println("Student Progress Portal");
    }

    // Type 2 — Parameters and No Return Value
    void displayStudent(String name) {
        System.out.println("Student: " + name);
    }

    // Type 3 — No Parameters with a Return Value
    int getPassingScore() {
        return 60;
    }

    // Type 4 — Parameters with a Return Value
    int calculateTotal(int javaScore, int sqlScore) {
        return javaScore + sqlScore;
    }
}

public class displayStudent {
    public static void main(String[] args) {
        StudentUtility utility = new StudentUtility();

        utility.showPortalTitle();                // Type 1
        utility.displayStudent("Asha");           // Type 2

        int passingScore = utility.getPassingScore();   // Type 3
        int total = utility.calculateTotal(82, 78);     // Type 4

        System.out.println("Passing Score: " + passingScore);
        System.out.println("Total Score: " + total);
    }
}
