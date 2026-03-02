import java.util.Scanner;

/**
 * =========================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 *
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 *
 * Example:
 * "A man a plan a canal Panama"
 *
 * @author Developer
 * @version 10.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Normalize input:
        // Remove all non-alphanumeric characters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = isPalindrome(normalized);

        if (isPalindrome) {
            System.out.println("The string IS a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }

    /**
     * Checks if a given string is a palindrome.
     *
     * @param str Normalized input string
     * @return true if palindrome, otherwise false
     */
    private static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}