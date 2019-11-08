package Quora;

public class ReverseInteger {
    public static int reverseInteger(int n) {
        int sol = 0;
        while (n!=0) {
            sol = sol * 10 + n % 10;
            n /= 10;
        }
        return sol;
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(123456789));
    }
}
