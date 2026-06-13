import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);   
        int num = sc.nextInt();
        int sumOfDivisors = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }
        if (sumOfDivisors == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
        sc.close();
    }
}
