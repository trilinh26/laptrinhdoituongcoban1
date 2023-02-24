package mang;

import java.util.Scanner;

public class daonguocphantumang {
    public static void main(String[] args) {
        int [] arrays;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ dài mảng ");
       int number = sc.nextInt();
        arrays=new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("phần tử mảng " + i);
            arrays[i]= sc.nextInt();
        }
        for (int i = 0; i < number; i++) {
            System.out.println(arrays[i]);
        }
        for (int j = 0; j < number / 2; j++) {
            int temp = arrays[j];
            arrays[j] = arrays[number - 1 - j];
            arrays[number- 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < arrays.length; j++) {
            System.out.print(arrays[j]);
        }
    }
}
