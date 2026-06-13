import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);   
        int num = sc.nextInt();
        System.out.print("Divisors of " + num + " are: ");
        for (int i = 1; i <= num/2; i++){
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(num);
        sc.close();
    }
}