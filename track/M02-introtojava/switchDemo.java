import java.util.Scanner;
public class switchDemo{
    public static void main (String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Ener the number:");
        int num = scan.nextInt();

        switch (num) {
            case 1:System.out.println("one");
            break;
            case 2:System.out.println("two");
            break;
            case 3:System.out.println("three");
            break;
            default:System.out.println("invalid");
                 
        }

    }
}