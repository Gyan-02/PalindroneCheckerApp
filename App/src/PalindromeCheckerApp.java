import java.util.LinkedList;
import java.util.Scanner;

/**
 * =========================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 *  - removeFirst()
 *  - removeLast()
 *
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @author Developer
 * @version 8.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC8.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Normalize input (remove spaces and ignore case)
        input = input.replaceAll("\\s+", "").toLowerCase();

        LinkedList<Character> list = new LinkedList<>();

        // Add characters to LinkedList
        for (char ch : input.toCharArray()) {
            list.add(ch);
        }

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string IS a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}