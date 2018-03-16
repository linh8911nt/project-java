package exercise;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Phương trình bậc 2 dạng a*x*x + b*x + c = 0");

        System.out.printf("Nhập a:");
        double a = scanner.nextDouble();

        System.out.printf("Nhập b:");
        double b = scanner.nextDouble();

        System.out.printf("Nhập c:");
        double c = scanner.nextDouble();

        if (a == 0){
            System.out.printf("a = 0 nên phương trình thành phương trình bậc 1 b*x + c = 0");
            if (b != 0){
                x = -c/a;
                System.out.println("Kết quả phương trình:%f " + x);
            }else {
                if (c == 0){
                    System.out.printf("Phương trình vô số nghiệm");
                }else {
                    System.out.printf("Phương trình vô nghiệm");
                }
            }
        }else {
            double delta = b*b - 4*a*c;
            if (delta < 0){
                System.out.printf("Phương trình vô nghiệm");
            }else if (delta == 0){
                x = -b/(2*a);
                System.out.printf("Kết quả" + x);
            }else {
                x = (-b + Math.sqrt(delta))/2*a;
                System.out.printf("Kết quả x1 = " + x);
                x = (-b - Math.sqrt(delta))/2*a;
                System.out.printf("Kết quả x2 = " + x);
            }

        }

    }
}
