import java.util.Scanner;

class Q120 {
    static Scanner sc = new Scanner(System.in);
    static String[] names = new String[5];
    static int[] marks = new int[5];
    static int count = 0;

    public static void addStudent() {
        if (count < names.length) {
            System.out.print("Enter student name: ");
            names[count] = sc.nextLine();
            System.out.print("Enter marks: ");
            marks[count] = sc.nextInt();
            sc.nextLine();
            count++;
            System.out.println("Student added.");
        } else {
            System.out.println("Record full.");
        }
    }

    public static void viewStudents() {
        System.out.println("\n--- Student Records ---");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + " -> " + marks[i]);
        }
    }

    public static void searchStudent() {
        System.out.print("Enter name to search: ");
        String search = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                System.out.println("Found: " + names[i] + " -> " + marks[i]);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Not found.");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Mini Project Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(); break;
                case 4: System.out.println("Exiting Project."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}
