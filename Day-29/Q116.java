import java.util.Scanner;

class Q116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] items = {"Pen", "Notebook", "Eraser"};
        int[] stock = {10, 5, 20};
        int choice;

        do {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. View Inventory");
            System.out.println("2. Add Stock");
            System.out.println("3. Remove Stock");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("--- Inventory ---");
                    for (int i = 0; i < items.length; i++) {
                        System.out.println(items[i] + " -> " + stock[i]);
                    }
                    break;
                case 2:
                    System.out.print("Enter item number to add stock (1-3): ");
                    int addIndex = sc.nextInt() - 1;
                    System.out.print("Enter quantity: ");
                    stock[addIndex] += sc.nextInt();
                    System.out.println("Stock updated.");
                    break;
                case 3:
                    System.out.print("Enter item number to remove stock (1-3): ");
                    int remIndex = sc.nextInt() - 1;
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    if (qty <= stock[remIndex]) {
                        stock[remIndex] -= qty;
                        System.out.println("Stock updated.");
                    } else {
                        System.out.println("Not enough stock.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Inventory System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
