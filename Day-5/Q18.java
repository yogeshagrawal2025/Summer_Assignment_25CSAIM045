import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);   
        int num = sc.nextInt();
        int sumOfFactorials = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }
        if (sumOfFactorials == num) {
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }
        sc.close();
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}