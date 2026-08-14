import java.util.Scanner;

class SupportTicket {
    int id;
    int priority;
    int waitingMinutes;
}

public class supptickref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and fill the first ticket
        SupportTicket t1 = new SupportTicket();
        t1.id = scanner.nextInt();
        t1.priority = scanner.nextInt();
        t1.waitingMinutes = scanner.nextInt();

        // Create and fill the second ticket
        SupportTicket t2 = new SupportTicket();
        t2.id = scanner.nextInt();
        t2.priority = scanner.nextInt();
        t2.waitingMinutes = scanner.nextInt();

        // Create and fill the third ticket
        SupportTicket t3 = new SupportTicket();
        t3.id = scanner.nextInt();
        t3.priority = scanner.nextInt();
        t3.waitingMinutes = scanner.nextInt();

        // Initially select the first ticket
        SupportTicket selected = t1;

        // Compare the second ticket
        if (t2.priority > selected.priority) {
            selected = t2;
        } else if (t2.priority == selected.priority && t2.waitingMinutes >= selected.waitingMinutes) {
            selected = t2;
        }

        // Compare the third ticket
        if (t3.priority > selected.priority) {
            selected = t3;
        } else if (t3.priority == selected.priority && t3.waitingMinutes >= selected.waitingMinutes) {
            selected = t3;
        }

        // Print the selected ticket details
        System.out.println("Selected Ticket: " + selected.id);
        System.out.println("Priority: " + selected.priority);
        System.out.println("Waiting Minutes: " + selected.waitingMinutes);

        scanner.close();
    }
}
