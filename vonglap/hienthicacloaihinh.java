package vonglap;

import java.util.Scanner;
public class hienthicacloaihinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Print the rectangle");
                int width = 7;
                int height = 4;
                for (int j = 0; j < height; j++) {
                    for (int i = 0; i < width; i++) {
                        System.out.printf("* ");

                    }
                    System.out.println("*");
                }
                break;
            case 2:
                System.out.println("Print the square triangle");
                for(int i=1; i<=5; i++){
                    for(int j=1; j<i; j++){
                        System.out.printf("* ");
                    }
                    System.out.println("*");
                }
                break;
            case 3:
                System.out.println("Print isosceles triangle");
                for(int i=7;i>=0;i--){
                    for(int j=1;j<=i;j++){
                        System.out.printf("* ");
                    }
                    System.out.println("*");
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
    }

