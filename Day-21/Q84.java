import java.util.Scanner;

class Q84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String upper = "";
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                upper += (char)(c - 32); // convert to uppercase
            } else {
                upper += c;
            }
        }

        System.out.println("Uppercase string = " + upper);

        sc.close();
    }
}
