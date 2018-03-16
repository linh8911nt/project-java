package exercise;
import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input Number:");
        int number = scanner.nextInt();
        String numberText;
        int ones = number % 10;
        int tens = number / 10;
        String onesText;
        String tensText;

        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    numberText = "Zero";
                    break;
                case 1:
                    numberText = "One";
                    break;
                case 2:
                    numberText = "Two";
                    break;
                case 3:
                    numberText = "Three";
                    break;
                case 4:
                    numberText = "Four";
                    break;
                case 5:
                    numberText = "Five";
                    break;
                case 6:
                    numberText = "Six";
                    break;
                case 7:
                    numberText = "Seven";
                    break;
                case 8:
                    numberText = "Eight";
                    break;
                case 9:
                    numberText = "Nine";
                    break;
                case 10:
                    numberText = "Ten";
                    break;

                default:
                    numberText = "";
            }
            if (numberText != "") {
                System.out.printf("Number: %s", numberText);
            }
        } else if (number < 20 && number > 10) {

            switch (ones) {
                case 1:
                    numberText = "Elevent";
                    break;
                case 2:
                    numberText = "Twelve";
                    break;
                case 3:
                    numberText = "Thirteen";
                    break;
                case 4:
                    numberText = "Fourteen";
                    break;
                case 5:
                    numberText = "Fifteen";
                    break;
                case 6:
                    numberText = "Sixteen";
                    break;
                case 7:
                    numberText = "Seventeen";
                    break;
                case 8:
                    numberText = "Eighteen";
                    break;
                case 9:
                    numberText = "Nineteen";
                    break;
                default:
                    numberText = "";
            }
            if (numberText != "") {
                System.out.printf("Number: %s", numberText);
            }
        } else if (number >= 20 && number < 100) {
            switch (ones) {
                case 1:
                    onesText = "One";
                    break;
                case 2:
                    onesText = "Two";
                    break;
                case 3:
                    onesText = "Three";
                    break;
                case 4:
                    onesText = "Four";
                    break;
                case 5:
                    onesText = "Five";
                    break;
                case 6:
                    onesText = "Six";
                    break;
                case 7:
                    onesText = "Seven";
                    break;
                case 8:
                    onesText = "Eight";
                    break;
                case 9:
                    onesText = "Nine";
                    break;
                default:
                    onesText = "";
            }
            switch (tens) {
                case 2:
                    tensText = "Twenty";
                    break;
                case 3:
                    tensText = "Thirty";
                    break;
                case 4:
                    tensText = "Fourty";
                    break;
                case 5:
                    tensText = "Fifty";
                    break;
                case 6:
                    tensText = "Sixty";
                    break;
                case 7:
                    tensText = "Seventy";
                    break;
                case 8:
                    tensText = "Eighty";
                    break;
                case 9:
                    tensText = "Ninety";
                    break;
                default:
                    tensText = "";
            }
            if (onesText != "" && tensText != "") {
                System.out.printf("Number: %s%s", tensText, onesText);
            }
        }else if (number >= 100 && number<1000){
            int hundred = number / 100;
            String hundredNumber;

        }
    }
}