import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int armstrongNumber = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            armstrongNumber += Math.pow(digit, 3);
            temp /= 10;
        }
        if (armstrongNumber == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        sc.close(); 
    }
}