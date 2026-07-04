import java.util.Scanner;

class Q104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Q1: Capital of India?");
        System.out.println("a) Delhi  b) Mumbai");
        String ans1 = sc.nextLine();
        if (ans1.equalsIgnoreCase("a") || ans1.equalsIgnoreCase("Delhi")) score++;

        System.out.println("Q2: Largest planet?");
        System.out.println("a) Earth  b) Jupiter");
        String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("b") || ans2.equalsIgnoreCase("Jupiter")) score++;

        System.out.println("Your score = " + score + "/2");

        sc.close();
    }
}
