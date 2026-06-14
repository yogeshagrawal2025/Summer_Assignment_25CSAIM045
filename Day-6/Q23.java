import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        int temp = num; 
        while (temp > 0) {
            count += (temp & 1);
            temp >>= 1;
        } 
        System.out.println("Number of set bits in " + num + " is: " + count);
        sc.close();
    }
}
