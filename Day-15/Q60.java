import java.util.Scanner;

class Q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Move zeroes to end
        int index = 0; // position for non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < n) {
            arr[index++] = 0;
        }

        System.out.println("Array after moving zeroes to end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
