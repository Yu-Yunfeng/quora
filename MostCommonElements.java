package Quora;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonElements {
    public static List<Integer> mostCommonElements(int[] nums) {
        List<Integer> sol = new ArrayList<>();
        if (nums==null || nums.length==0) return sol;
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        for (int num : nums) {
            int count = map.getOrDefault(num, 0)+1;
            map.put(num, count);
            maxCount = Math.max(maxCount, count);
        }
        for (int num : map.keySet()) {
            if (map.get(num)==maxCount) sol.add(num);
        }
        sol.sort((a, b)->a-b);
        return sol;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,3,3,5};
        List<Integer> l = mostCommonElements(nums);
        for (int i : l) {
            System.out.print(i);
        }
        System.out.println();
    }
}
