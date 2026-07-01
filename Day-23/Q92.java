import java.util.Scanner;
import java.util.HashMap;

class Q92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (c != ' ') {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }

        char maxChar = ' ';
        int maxCount = 0;
        for (char c : freq.keySet()) {
            if (freq.get(c) > maxCount) {
                maxCount = freq.get(c);
                maxChar = c;
            }
        }

        System.out.println("Maximum occurring character = " + maxChar + " (frequency = " + maxCount + ")");

        sc.close();
    }
}
