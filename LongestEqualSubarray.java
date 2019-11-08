package Quora;

import java.util.HashMap;
import java.util.Map;

public class LongestEqualSubarray {
    public static int longestEqualSubarray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int diff = 0;
        int sol = 0;
        for (int i=0; i<nums.length; i++) {
            diff += nums[i] == 1 ? 1 : -1;
            if (map.containsKey(diff)) {
                sol = Math.max(sol, i-map.get(diff));
            } else {
                map.put(diff, i);
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,0,1,1,0,1,0,1};
        System.out.println(longestEqualSubarray(nums));
    }
}
