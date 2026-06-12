import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci series up to " + num + ": ");
        System.out.print(first + " " + second);
        for (int i = 1; i <num-1; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        sc.close();
    }
}