import java.util.Scanner;

class Q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int num : arr) {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);

        sc.close();
    }
}
