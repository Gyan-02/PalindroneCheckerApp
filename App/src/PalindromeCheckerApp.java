import java.util.Scanner;

/**
 * =========================================================
 * MAIN CLASS - UseCase9RecursivePalindromeCheckerApp
 * =========================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Developer
 * @version 9.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Normalize input (remove spaces and ignore case)
        input = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = check(input, 0, input.length() - 1);

        if (result) {
            System.out.println("The string IS a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }

    /**
     * Recursively checks whether a string is a palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base case: all characters checked
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}