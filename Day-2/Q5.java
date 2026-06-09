import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt(); 
        int sum = 0;
        while(num > 0) {
            int digit = num % 10; 
            sum += digit; 
            num /= 10; 
        }
        System.out.println("The sum of the digits is: " + sum);
        sc.close();
    }
}