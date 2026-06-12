import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int armstrongNumber = 0;
            int temp = i;
            while (temp != 0) {
                int digit = temp % 10;
                armstrongNumber += Math.pow(digit, 3);
                temp /= 10;
            }
            if (armstrongNumber == i) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
        sc.close();
    }
}