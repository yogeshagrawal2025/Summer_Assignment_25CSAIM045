import java.util.HashSet;

class Q98 {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "grape";

        HashSet<Character> set1 = new HashSet<>();
        for (char c : s1.toCharArray()) set1.add(c);

        System.out.print("Common characters: ");
        for (char c : s2.toCharArray()) {
            if (set1.contains(c)) System.out.print(c + " ");
        }
    }
}
