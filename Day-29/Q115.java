import java.util.Scanner;

class Q115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "hello world";
        int choice;

        do {
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Display String");
            System.out.println("2. Reverse String");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Count Vowels");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("String = " + str);
                    break;
                case 2:
                    String rev = new StringBuilder(str).reverse().toString();
                    System.out.println("Reversed = " + rev);
                    break;
                case 3:
                    System.out.println("Uppercase = " + str.toUpperCase());
                    break;
                case 4:
                    int vowels = 0;
                    for (char c : str.toLowerCase().toCharArray()) {
                        if ("aeiou".indexOf(c) != -1) vowels++;
                    }
                    System.out.println("Vowel count = " + vowels);
                    break;
                case 5:
                    System.out.println("Exiting String System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
