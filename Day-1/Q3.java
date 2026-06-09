import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        System .out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);    
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + num + " is: " + factorial);
        sc.close();
    }
}
