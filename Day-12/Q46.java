import java.util.*;
public class Q46 {
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        return original == sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        scanner.close();
    }
}
