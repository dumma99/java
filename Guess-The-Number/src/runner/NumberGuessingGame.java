package runner;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number" +
                +"between 1 to 100");
        int userEnteredNumber = 0;
        int attempt = 0;

        while (userEnteredNumber != target) {
            System.out.println("Enter the Number :");
            userEnteredNumber = scanner.nextInt();
            attempt++;
            if (userEnteredNumber<target) {
                System.out.println("Too low !try again");
            } else if (userEnteredNumber>target) {
                System.out.println("Too high !try again");
            } else {
                System.out.println("Correct..!Guess");
            }
        }
    }
}
