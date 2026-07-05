import java.util.Scanner;

class Q105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];
        int[] marks = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter student name: ");
            names[i] = sc.nextLine();
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\n--- Student Records ---");
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i] + " -> " + marks[i]);
        }

        sc.close();
    }
}
