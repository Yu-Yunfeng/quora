package Quora;

public class SumOfString {
    public static String addString(String n, String m) {
        StringBuilder sol = new StringBuilder();
        int i = n.length()-1, j = m.length()-1;

        while (i>=0 || j>=0) {
            int sum = 0;
            sum += i>=0 ? n.charAt(i--) - '0' : 0;
            sum += j>=0 ? m.charAt(j--) - '0' : 0;
            sol.insert(0, Integer.toString(sum));
        }
        return sol.toString();
    }

    public static void main(String[] args) {
        System.out.println(addString("99", "999"));
    }
}
