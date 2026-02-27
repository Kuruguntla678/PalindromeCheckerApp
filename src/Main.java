import java.util.Scanner;
import java.util.Stack;

// Service class - Encapsulated Palindrome Logic
class PalindromeChecker {

    // Public method to check palindrome
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Remove spaces and convert to lowercase
        input = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters to stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Compare original string with reversed (using stack)
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main Application Class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.println("===== UC11: Object-Oriented Palindrome Service =====");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}