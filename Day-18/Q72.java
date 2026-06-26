import java.util.Scanner;
import java.util.Arrays;

class Q72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n]; // use Integer for Arrays.sort with comparator

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr, (a, b) -> b - a); // descending order

        System.out.println("Array in descending order:");
        for (int num : arr) System.out.print(num + " ");

        sc.close();
    }
}
