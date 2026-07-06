import java.util.Scanner;

class Q110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        int choice;

        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance = " + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    balance += sc.nextInt();
                    System.out.println("Deposited. Balance = " + balance);
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: ");
                    int wd = sc.nextInt();
                    if (wd <= balance) {
                        balance -= wd;
                        System.out.println("Withdrawn. Balance = " + balance);
                    } else System.out.println("Insufficient funds.");
                    break;
                case 4:
                    System.out.println("Exiting Bank System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
