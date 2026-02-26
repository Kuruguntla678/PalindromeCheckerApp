
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1
        displayWelcomeMessage();

        // UC2
        checkHardcodedPalindrome();

        // UC3
        checkPalindromeUsingLoop();

        System.out.println("Application is ready for palindrome processing...");
    }

    // UC1 logic
    public static void displayWelcomeMessage() {
        System.out.println("=========================================");
        System.out.println("        PALINDROME CHECKER APP           ");
        System.out.println("=========================================");
        System.out.println("Application Version : 1.0.0");
        System.out.println("Developed for: Learning Git & Java");
        System.out.println("=========================================");
    }

    // UC2 logic
    public static void checkHardcodedPalindrome() {
        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("Result: " + word + " is a palindrome ✅");
        } else {
            System.out.println("Result: " + word + " is NOT a palindrome ❌");
        }
    }

    // UC3 logic
    public static void checkPalindromeUsingLoop() {
        String word = "racecar";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println("Result: " + word + " is a palindrome ✅");
        } else {
            System.out.println("Result: " + word + " is NOT a palindrome ❌");
        }
    }
}