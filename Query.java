package Quora;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Query {
    public static int query(int[] nums, int[][] queries) {
        int sol = 0;
        if (queries==null || queries.length==0) return sol;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            List<Integer> list = map.getOrDefault(nums[i], new ArrayList<>());
            list.add(i);
            map.put(nums[i], list);
        }
        for (int[] query : queries) {
            List<Integer> list = map.get(query[2]);
            for (int i : list) {
                if (i<=query[1] && i>=query[0]) sol++;
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,3,2};
        int[][] queries = new int[][]{
                new int[]{1,2,1},
                new int[]{2,4,2},
                new int[]{0,3,1}
        };
        System.out.println(query(nums, queries));
    }
}
