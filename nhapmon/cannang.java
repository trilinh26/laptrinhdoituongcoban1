package nhapmon;

import java.util.Scanner;

public class cannang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height,bmi;
        System.out.println("cân nặng :");
        weight=scanner.nextDouble();
        System.out.println("chiều cao :");
        height=scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "thiếu cân");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Bình thường");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Thừa cân");
        else
            System.out.printf("%-20.2f%s", bmi, "Béo phì");
    }
}
