 package thuchanh;

public class test6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = tinhTong(arr);
        System.out.println(sum);
    }

    private static int tinhTong(int[] arr) {

        int sum = 0;
        for (int number : arr) {
            sum += number;
        }


        return sum;
    }

}