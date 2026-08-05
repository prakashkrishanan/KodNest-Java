public class placement2 {
    public static void main(String[] args) {

        int marks = 58;
        int attendance = 82;
        boolean specialApproval = true;
        boolean blocked = false;

        boolean allowed =
                (marks >= 60 && attendance >= 75)
                || (specialApproval && !blocked);

        if (allowed && marks >= 75) {
            System.out.println("Directly Eligible");
        } else if (allowed) {
            System.out.println("Eligible with Approval");
        } else {
            System.out.println("Not Eligible");
        }
    }
}