import java.util.*;

public class aurigo {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // 1. Reverse String
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            System.out.println("Reversed String: " + reverseString(str));

            // 2. Palindrome
            System.out.print("Enter a string for palindrome check: ");
            String pal = sc.nextLine();
            System.out.println("Palindrome: " + isPalindrome(pal));

            // 3. Count Vowels
            System.out.print("Enter a string to count vowels: ");
            String vowelStr = sc.nextLine();
            System.out.println("Vowel Count: " + countVowels(vowelStr));

            // 4. Count Characters
            System.out.print("Enter a string to count characters: ");
            String charStr = sc.nextLine();
            System.out.println("Character Count: " + countCharacters(charStr));

            // 5. Find Duplicate Characters
            System.out.print("Enter a string to find duplicates: ");
            String dupStr = sc.nextLine();
            System.out.println("Duplicate Characters: " + findDuplicateCharacters(dupStr));

            // 6. Largest and Smallest Number
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Largest Number: " + findLargest(arr));
            System.out.println("Smallest Number: " + findSmallest(arr));

            // 7. Remove Duplicates from Array
            System.out.println("Array after removing duplicates: " + Arrays.toString(removeDuplicates(arr)));

            // 8. Count Words
            sc.nextLine();
            System.out.print("Enter a sentence to count words: ");
            String sentence = sc.nextLine();
            System.out.println("Word Count: " + countWords(sentence));

            // 9. Swap Numbers
            System.out.print("Enter two numbers to swap: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] swapped = swapNumbers(a, b);
            System.out.println("After Swap: a = " + swapped[0] + ", b = " + swapped[1]);

            // 10. Prime Number
            System.out.print("Enter a number to check prime: ");
            int primeNum = sc.nextInt();
            System.out.println("Prime: " + isPrime(primeNum));

            // 11. Fibonacci
            System.out.print("Enter number of Fibonacci terms: ");
            int fibN = sc.nextInt();
            System.out.print("Fibonacci Series: ");
            fibonacci(fibN);

            // 12. Factorial
            System.out.print("Enter a number for factorial: ");
            int factN = sc.nextInt();
            System.out.println("Factorial: " + factorial(factN));

        }
    }

    static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("\\s+", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    static int countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }

    static int countCharacters(String s) {
        return s.length();
    }

    static Set<Character> findDuplicateCharacters(String s) {
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                duplicates.add(c);
            } else {
                seen.add(c);
            }
        }
        return duplicates;
    }

    static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    static int findSmallest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) set.add(num);

        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) result[i++] = num;
        return result;
    }

    static int countWords(String s) {
        String trimmed = s.trim();
        if (trimmed.isEmpty()) return 0;
        return trimmed.split("\\s+").length;
    }

    static int[] swapNumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + (i < n - 1 ? " " : ""));
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}