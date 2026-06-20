import java.util.*;
public class Q45 {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        scanner.close();
    }
}