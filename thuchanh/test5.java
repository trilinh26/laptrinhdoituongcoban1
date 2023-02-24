package thuchanh;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập 1 số bất kỳ:");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + " is not a prime");
        } else {
            int i = 2;
            boolean a = true;
            while (i < number) {
                if (number % i == 0) {
                    a = false;
                    break;
                }
            }
                if (a)
                    System.out.println(number + " is a prime");
                else
                    System.out.println(number + " is not a prime");
            }
    }
}