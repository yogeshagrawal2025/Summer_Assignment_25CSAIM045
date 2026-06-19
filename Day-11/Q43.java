import java.util.Scanner;
public class Q43 {
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        boolean result = isPrime(num);
        if(result){
            System.out.println(num+" is a prime number.");
        } else {
            System.out.println(num+" is not a prime number.");
        }
        sc.close();
    }
}