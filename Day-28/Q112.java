import java.util.Scanner;

class Q112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        String[] numbers = new String[5];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Contact Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < names.length) {
                        System.out.print("Enter name: ");
                        names[count] = sc.nextLine();
                        System.out.print("Enter number: ");
                        numbers[count] = sc.nextLine();
                        count++;
                        System.out.println("Contact added.");
                    } else System.out.println("Contact list full.");
                    break;
                case 2:
                    System.out.println("--- Contacts ---");
                    for (int i = 0; i < count; i++) {
                        System.out.println(names[i] + " -> " + numbers[i]);
                    }
                    break;
                case 3:
                    System.out.println("Exiting Contact System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        sc.close();
    }
}
