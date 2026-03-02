/**
 * =============================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
 */

public class PalindromeCheckerApp{

    /**
     * Application entry point for UC2.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded string
        String text = "madam";

        // Display input
        System.out.println("Input String: " + text);

        // Convert to lowercase (optional safety step)
        text = text.toLowerCase();

        // Initialize variables
        int start = 0;
        int end = text.length() - 1;
        boolean isPalindrome = true;

        // Compare characters from both ends
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}