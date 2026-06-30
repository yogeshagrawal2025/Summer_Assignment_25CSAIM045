import java.util.Scanner;

class Q85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equalsIgnoreCase(reversed))
            System.out.println("String is a palindrome.");
        else
            System.out.println("String is not a palindrome.");

        sc.close();
    }
}
