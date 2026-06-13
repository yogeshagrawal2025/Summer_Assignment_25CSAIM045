import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);   
        int num = sc.nextInt();
        int primeFactor = 1;
        for (int i = 1; i <= num/2; i++){
            if (num % i == 0) {
                boolean isPrime = true;
                for (int j = 2; j <i/2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                   primeFactor = i;
                }
            }
        }
        System.out.println("Large prime factor of " + num + " is: " + primeFactor);    
        sc.close();
    }
}