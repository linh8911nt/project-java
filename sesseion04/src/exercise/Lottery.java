package exercise;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int lottery = 00;
        lottery = (int) (Math.random()) * 99;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Guess Digit1:");
        int guessDigit1 = scanner.nextByte();

        System.out.printf("Guess Digit2:");
        int guessDigit2 = scanner.nextByte();

        int digitNumber = lottery / 10;
        int digitUnit = lottery % 10;

        if (digitNumber == guessDigit1) {
            if (digitUnit == guessDigit2) {
                System.out.printf("Bạn trúng phần thưởng $10,000");
            } else {
                System.out.printf("Bạn trúng phần thưởng $1,000");
            }
        } else {
            if (digitUnit == guessDigit1 && digitNumber == guessDigit2) {
                System.out.printf("Bạn trúng phần thưởng $3,000");
            } else {
                System.out.printf("Bạn không trúng thưởng");
            }
        }
    }
}
