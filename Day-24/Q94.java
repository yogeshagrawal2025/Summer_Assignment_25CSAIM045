import java.util.Scanner;

class Q94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) != str.charAt(i - 1)) {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            } else {
                count++;
            }
        }

        System.out.println("Compressed string = " + compressed);

        sc.close();
    }
}
