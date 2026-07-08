import java.util.Scanner;

class Q119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] empNames = new String[3];
        int[] salaries = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter employee name: ");
            empNames[i] = sc.nextLine();
            System.out.print("Enter salary: ");
            salaries[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\n--- Employee Records ---");
        for (int i = 0; i < 3; i++) {
            System.out.println(empNames[i] + " -> Salary: " + salaries[i]);
        }

        sc.close();
    }
}
