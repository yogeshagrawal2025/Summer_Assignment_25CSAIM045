import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + num + " natural numbers is: " + sum);
        sc.close();
    }
}
