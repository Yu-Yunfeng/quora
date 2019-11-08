package Quora;

import java.util.ArrayList;
import java.util.List;

public class IsPrefix {
    public static boolean isPrefix(String[] a, String[] b) {
        // build a set for permutation of string in a;
        return false;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        if (nums==null || nums.length==0) return sol;
        pmtHelper(sol, nums, new ArrayList<>());
        return sol;
    }

    private void pmtHelper(List<List<Integer>> sol, int[] nums, List<Integer> curr) {
        if (curr.size()==nums.length) {
            sol.add(new ArrayList<>(curr));
            return;
        }
        for (int i=0; i<nums.length; i++) {
            if (curr.contains(nums[i])) continue;
            curr.add(nums[i]);
            pmtHelper(sol, nums, curr);
            curr.remove(curr.size()-1);
        }
    }
}
