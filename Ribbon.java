package Quora;

import java.util.Arrays;

public class Ribbon {
    public static int ribbon(int[] arr, int k) {
        if (arr==null || arr.length==0) return 0;
        Arrays.sort(arr);
        int hi = arr[arr.length-1];
        int lo = 1;
        int sol = 0;
        while (lo<hi) {
            int mid = lo + (hi - lo) / 2;
            int parts = 0;
            for (int i : arr) {
                parts += i / mid;
            }
            if (parts>=k) {
                sol = Math.max(sol, mid);
                lo = mid+1;
            } else hi = mid-1;
        }
        return sol;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,9};
        int k = 5;
        System.out.println(ribbon(nums, k));
    }
}
