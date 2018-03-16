package example;
import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        double a,b,c;
        System.out.println("Giải phương trình bậc nhất dạng a*x + b = 0");
        Scanner scanner = new Scanner(System.in);

        System.out.println("a:");
        a = scanner.nextDouble();
        System.out.println("b:");
        b = scanner.nextDouble();
        System.out.println("c:");
        c = scanner.nextDouble();

        if (a != 0){
            double solution = -b/a;
            System.out.printf("Kết quả là: %f", solution);
        } else {
            if (b == 0){
                System.out.println("Kết quả vô số nghiệm");
            } else {
                System.out.println("Kết quả vô nghiệm");
            }
        }

    }
}
