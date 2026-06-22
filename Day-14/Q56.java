import java.util.Scanner;

class Q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean hasDuplicates = false;
        System.out.println("Duplicate elements are:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    hasDuplicates = true;
                    break; // avoid printing same duplicate multiple times
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }

        sc.close();
    }
}
