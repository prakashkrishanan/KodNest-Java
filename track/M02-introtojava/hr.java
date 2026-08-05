public class hr {
    public static void main(String[] args) {

        int roundCode = 2;
        int attemptsUsed = 2;
        String nextRound = switch (roundCode) {
            case 1 -> "Aptitude Round";
            case 2 -> "Technical Round";
            case 3 -> "HR Round";
            default -> "Invalid Round";
        };

        String attemptStatus =
                attemptsUsed < 3
                ? "Another Attempt Available"
                : "Attempt Limit Reached";

        System.out.println("Next: " + nextRound);
        System.out.println(attemptStatus);
    }
}