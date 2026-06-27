import java.util.Scanner;

class Q76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        int primarySum = 0, secondarySum = 0;
        for (int i = 0; i < n; i++) {
            primarySum += a[i][i];             // primary diagonal
            secondarySum += a[i][n - i - 1];   // secondary diagonal
        }

        System.out.println("Primary diagonal sum = " + primarySum);
        System.out.println("Secondary diagonal sum = " + secondarySum);

        sc.close();
    }
}
