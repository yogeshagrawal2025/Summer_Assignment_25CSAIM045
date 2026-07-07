import java.util.Scanner;
import java.util.Arrays;

class Q114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int choice;

        do {
            System.out.println("\n--- Array Operations Menu ---");
            System.out.println("1. Display Array");
            System.out.println("2. Find Sum");
            System.out.println("3. Find Max");
            System.out.println("4. Sort Array");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Array: " + Arrays.toString(arr));
                    break;
                case 2:
                    int sum = 0;
                    for (int x : arr) sum += x;
                    System.out.println("Sum = " + sum);
                    break;
                case 3:
                    int max = arr[0];
                    for (int x : arr) if (x > max) max = x;
                    System.out.println("Max = " + max);
                    break;
                case 4:
                    Arrays.sort(arr);
                    System.out.println("Sorted Array: " + Arrays.toString(arr));
                    break;
                case 5:
                    System.out.println("Exiting Array System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
