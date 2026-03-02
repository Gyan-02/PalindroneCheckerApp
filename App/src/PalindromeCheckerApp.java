/**
 * ===============================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 *  - Pushes characters onto a stack
 *  - Pops them in reverse order
 *  - Compares with original sequence
 *  - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author Developer
 * @version 5.0
 */

import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    /**
     * Application entry point for UCS.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a word to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Normalize input (remove spaces and convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Push all characters onto the stack
        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }

        // Build reversed string by popping from stack
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Check if palindrome
        if (normalized.equals(reversed.toString())) {
            System.out.println("Result: \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}