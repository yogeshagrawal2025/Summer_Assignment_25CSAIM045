import java.util.Scanner;
public class Q40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1;j<n-i+1;j++){
                System.out.print("  ");
            }
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            ch = (char)(ch-2);
            for (int j = i-1; j >= 1; j--) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
        scanner.close();
    }
}