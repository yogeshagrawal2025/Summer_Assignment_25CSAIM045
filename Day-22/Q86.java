import java.util.Scanner;

class Q86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        // Split by spaces
        String[] words = sentence.split("\\s+");

        System.out.println("Word count = " + words.length);

        sc.close();
    }
}
