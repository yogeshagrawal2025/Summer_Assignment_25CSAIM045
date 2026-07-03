import java.util.Arrays;

class Q100 {
    public static void main(String[] args) {
        String[] words = {"Java", "Programming", "Is", "Fun"};

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        System.out.println("Words sorted by length: " + Arrays.toString(words));
    }
}
