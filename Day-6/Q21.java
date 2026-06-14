import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = "";
        int temp = decimal;
        if (temp == 0) {
            binary = "0";
        } else {
            while (temp > 0) {
                int remainder = temp % 2;
                binary = remainder + binary;
                temp = temp / 2;
            }
        }
        System.out.println("Binary equivalent of " + decimal + " is: " + binary);
        sc.close();
    }
}
