package vonglap;

import java.util.Scanner;

public class tienlaichovay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập tiền muốn gửi");
        money = input.nextDouble();
        System.out.printf("nhập số tháng gửi");
        month=input.nextInt();
        System.out.println("nhập lãi xuất");
        interestRate=input.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
            System.out.println("Total of interest: " + totalInterest);
        }
    }
}
