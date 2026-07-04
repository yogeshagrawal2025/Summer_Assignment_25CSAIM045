import java.util.Scanner;

class Q101 {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 100) + 1; // random between 1–100
        Scanner sc = new Scanner(System.in);
        int guess;

        System.out.println("Guess the number between 1 and 100!");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess < number) System.out.println("Too low!");
            else if (guess > number) System.out.println("Too high!");
            else System.out.println("Correct! The number was " + number);
        } while (guess != number);

        sc.close();
    }
}
