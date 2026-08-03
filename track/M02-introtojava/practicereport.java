public class practicereport {
    public static void main(String[] args) {

        int solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;

        // Widening
        double reportValue = (int) solvedProblems;

        // Narrowing
        int wholePercentage = (int) exactPercentage;

        // Average problems per day
        double averagePerDay = (double) solvedProblems / practiceDays;

        // Check target
        boolean dailyTargetReached = averagePerDay >= 9.0;

        System.out.println("Report Value: " + reportValue);
        System.out.println("Whole Percentage: " + wholePercentage);
        System.out.println("Average Per Day: " + averagePerDay);
        System.out.println("Daily Target Reached: " + dailyTargetReached);
    }
}