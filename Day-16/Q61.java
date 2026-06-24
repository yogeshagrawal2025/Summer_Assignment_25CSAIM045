import java.util.Scanner;

class Q61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (size of array + 1): ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " elements (from 1 to " + n + " with one missing):");
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int totalSum = n * (n + 1) / 2;
        int missing = totalSum - sum;

        System.out.println("Missing number = " + missing);

        sc.close();
    }
}
