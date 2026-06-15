import java.util.Scanner;
public class Q28 {
    public static int reverseNumber(int n){
        int rev = 0;
        while(n != 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = reverseNumber(num);
        System.out.println("Reverse of " + num + " is: " + result);
        sc.close();
    }
}