import java.util.Scanner;

class Q111{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seats = 10;
        int choice;

        do {
            System.out.println("\n--- Ticket Booking Menu ---");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available seats = " + seats);
                    break;
                case 2:
                    System.out.print("Enter number of tickets: ");
                    int book = sc.nextInt();
                    if (book <= seats) {
                        seats -= book;
                        System.out.println("Booked " + book + " tickets. Remaining = " + seats);
                    } else System.out.println("Not enough seats.");
                    break;
                case 3:
                    System.out.println("Exiting Ticket System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        sc.close();
    }
}
