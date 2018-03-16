package example;

import java.util.Scanner;

public class Bodymassindex {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        double weight; //cân nặng
        double height; // chiều cao đơn vị m

        System.out.print("Cân nặng:");
        weight = scanner.nextDouble();

        System.out.print("Chiều cao:");
        height = scanner.nextDouble();

        double bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","Xếp loại");

        if (bmi<18.5)
            System.out.printf("%-20.2f%s",bmi,"Underweight");
        else if (bmi<25.0)
            System.out.printf("%-20.2f%s",bmi,"Normal");
        else if (bmi<30.0)
            System.out.printf("%-20.2f%s",bmi,"Overweight");
        else
            System.out.printf("%-20.2f%s",bmi,"Obese");
    }
}
