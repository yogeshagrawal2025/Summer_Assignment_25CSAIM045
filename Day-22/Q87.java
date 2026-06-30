
import java.util.Scanner;
import java.util.HashMap;

class Q87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (c != ' ') { // ignore spaces
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Character frequencies:");
        for (char c : freq.keySet()) {
            System.out.println(c + " -> " + freq.get(c));
        }

        sc.close();
    }
}
