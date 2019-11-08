package Quora;

import java.util.HashSet;
import java.util.Set;

public class GoodTuples {
    public static int goodTuples(int[] nums) {
        if (nums==null || nums.length==0) return 0;
        int sol = 0;
        for (int i=1; i<nums.length-1; i++) {
            int a = nums[i-1];
            int b = nums[i];
            int c = nums[i+1];
            // two different elements in three
            Set<Integer> set = new HashSet<>();
            set.add(a);
            set.add(b);
            set.add(c);
            if (set.size()==2) sol++;
//            list
//            if ((a == b && a != c) || (a == c && a != b) || (b == c && a != c)) sol++;

            // three different elements in three
//            Set<Integer> set = new HashSet<>();
//            set.add(a);
//            set.add(b);
//            set.add(c);
//            if (set.size()==3) sol++;
//          list
//            if (a!=b && a!=c && b!=c) sol++;
        }
        return sol;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,1,5,3,2,3,4};
        System.out.println(goodTuples(nums));
    }
}
