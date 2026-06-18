import java.util.Scanner;
public class Q38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j=n; j>n-i+1; j--){
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * (n-i) + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}