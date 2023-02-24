package vonglap;

import java.util.Scanner;
public class nguyentonhohon {

    public static void main(String[] args) {
        System.out.println("các số nguyên tố nhỏ hơn 100 là");
        for (int j = 1; j < 100; j++) {
            int dem = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    dem++;
                }
            }
            if (dem == 2) {
                System.out.println("  "+j);
                }
            }
        }
    }

