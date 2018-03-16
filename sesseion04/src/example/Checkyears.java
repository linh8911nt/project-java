package example;
import java.util.Scanner;

public class Checkyears {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập năm:");
        year = scanner.nextInt();

        if (year%4 == 0){
            if (year%100 == 0){
                if (year%400 == 0){
                    System.out.printf("%d Là năm nhuận",year);
                }else {
                    System.out.printf("%d Không là năm nhuận",year);
                }
            }else {
                System.out.printf("%d Là năm nhuận",year);
            }

        }else {
            System.out.printf("%d Không là năm nhuận",year);
        }
    }
}
