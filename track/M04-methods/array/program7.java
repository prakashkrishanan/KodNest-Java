import java.util.Scanner;

class ScoreEditor {
    // Method to correct a score at a given index
    public void correctScore(int[] scores, int index, int newScore) {
        if (index >= 0 && index < scores.length) {
            scores[index] = newScore;
        } else {
            System.out.println("Invalid index");
        }
    }

    // Method to display all scores
    public void displayScores(int[] scores) {
        System.out.print("Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}

public class program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read array size
        int size = scanner.nextInt();
        int[] scores = new int[size];

        // Read all scores
        for (int i = 0; i < size; i++) {
            scores[i] = scanner.nextInt();
        }

        // Read correction index and new score
        int correctionIndex = scanner.nextInt();
        int newScore = scanner.nextInt();

        // Create ScoreEditor object
        ScoreEditor editor = new ScoreEditor();

        // Correct the score and display results
        editor.correctScore(scores, correctionIndex, newScore);
        editor.displayScores(scores);
    }
}
