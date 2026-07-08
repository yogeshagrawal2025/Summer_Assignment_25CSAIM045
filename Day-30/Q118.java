import java.util.Scanner;

class Q118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = {"Java Basics", "Python Guide", "C++ Handbook"};
        boolean[] issued = new boolean[books.length];
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < books.length; i++) {
                        System.out.println((i+1) + ". " + books[i] + (issued[i] ? " (Issued)" : ""));
                    }
                    break;
                case 2:
                    System.out.print("Enter book number to issue: ");
                    int b = sc.nextInt();
                    if (!issued[b-1]) {
                        issued[b-1] = true;
                        System.out.println("Book issued.");
                    } else System.out.println("Already issued.");
                    break;
                case 3:
                    System.out.print("Enter book number to return: ");
                    int r = sc.nextInt();
                    if (issued[r-1]) {
                        issued[r-1] = false;
                        System.out.println("Book returned.");
                    } else System.out.println("Not issued.");
                    break;
                case 4:
                    System.out.println("Exiting Library.");
                    break;
            }
        } while (choice != 4);

        sc.close();
    }
}
