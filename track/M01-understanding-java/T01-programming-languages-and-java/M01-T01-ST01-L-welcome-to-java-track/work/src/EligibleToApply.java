
public class EligibleToApply {

    public static void main(String[] args) {
        int percentage = 60;
        int activebacklogs = 2;

        if (percentage >= 60 && activebacklogs <= 3) {
            System.out.println("EligibleToApply");
        } else {
            System.out.println("NotEligibleToApply");
        }

    }
}
