import java.util.Scanner;

class Q77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of first matrix: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int[][] a = new int[r1][c1];

        System.out.print("Enter rows and columns of second matrix: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();
        int[][] b = new int[r2][c2];

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible (c1 != r2).");
            return;
        }

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                b[i][j] = sc.nextInt();

        int[][] product = new int[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    product[i][j] += a[i][k] * b[k][j];

        System.out.println("Product of matrices:");
        for (int[] row : product) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        sc.close();
    }
}
