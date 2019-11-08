package Quora;

public class EvenDigit {
    public static int evenDigits(int[] nums) {
        int sol = 0;
        if (nums==null || nums.length==0) return sol;
        for (int num : nums) {
            int dCount = 0;
            while (num!=0) {
                dCount++;
                num /= 10;
            }
            if (dCount % 2 == 0) sol++;
        }
        return sol;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {12, 3, 5, 3056};
        System.out.println(evenDigits(nums));
    }
}
