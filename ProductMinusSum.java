package Quora;

public class ProductMinusSum {
    public static int productMinusSum (int i) {
        if (i==0) return 0;
        int product = 1;
        int sum = 0;
        while (i!=0) {
            int d = i % 10;
            i /= 10;
            product *= d;
            sum += d;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println(productMinusSum(230));
    }
}
