import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter base (x): ");
        int x = sc.nextInt();
        
        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();
        
        long result = power(x, n);
        
        System.out.println(x + "^" + n + " = " + result);
        sc.close();
    }
    
    public static long power(int x, int n) {
        long result = 1;
        if (n < 0) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
}
