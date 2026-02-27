import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    // Method to check palindrome (iterative approach)
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC10: Case-Insensitive & Space-Ignored Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // 🔹 Step 1: Normalize the string
        // Remove all spaces using regular expression
        input = input.replaceAll("\\s+", "");

        // Convert to lowercase
        input = input.toLowerCase();

        // 🔹 Step 2: Apply palindrome logic
        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("Result: The string is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}