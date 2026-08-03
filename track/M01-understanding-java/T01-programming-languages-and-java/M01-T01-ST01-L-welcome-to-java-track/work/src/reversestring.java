
public class reversestring {

    public static void main(String[] args) {

        // Reverse a String
        String str = "Prakash";
        String reverseStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }

        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reverseStr);
    }
}
