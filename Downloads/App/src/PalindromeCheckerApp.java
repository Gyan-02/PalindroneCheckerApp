/**
 * ============================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 *
 * At this stage, the application:
 * - Defines a common PalindromeStrategy interface
 * - Implements a concrete Stack based strategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 *
 * No performance comparison is done in this use case.
 * The focus is purely on algorithm interchangeability.
 *
 * The goal is to teach extensible algorithm design.
 *
 * @author Developer
 * @version 12.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        // Choose strategy
        PalindromeStrategy strategy = new StackStrategy();

        // Execute strategy
        boolean result = strategy.isPalindrome(word);

        if(result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}


/**
 * ============================================================
 * INTERFACE - PalindromeStrategy
 * ============================================================
 *
 * This interface defines a contract for all
 * palindrome checking algorithms.
 *
 * Any new algorithm must implement this interface
 * and provide its own validation logic.
 */

interface PalindromeStrategy {

    boolean isPalindrome(String text);

}


/**
 * ============================================================
 * CLASS - StackStrategy
 * ============================================================
 *
 * This strategy checks palindrome using a Stack.
 */

class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String text) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push all characters into stack
        for(int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        // Compare with popped characters
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}