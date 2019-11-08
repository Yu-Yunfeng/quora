package Quora;

import java.util.*;

public class CoolFeature {
    public static List<Integer> coolFeature(int[] a, int[] b, List<List<Integer>> query) {
        List<Integer> list = new ArrayList<>();
        if (query==null || query.size()==0) return list;
        for (int i=0; i<query.size(); i++) {
            if (query.get(i).size()==2) {
                int count = twoSum(a, b, query.get(i).get(1));
                list.add(count);
            } else if (query.get(i).size()>2) {
                int x = query.get(i).get(1);
                int y = query.get(i).get(2);
                b[x] = y;
            }
        }
        return list;
    }

    private static int twoSum(int[] a, int[] b, int sum) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int n : a) {
            set.add(n);
        }
        for (int m : b) {
            if (set.contains(sum-m)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        int[] b = new int[]{3,4};
        List<Integer> q1 = new ArrayList<>();
        q1.add(1);
        q1.add(5);
        List<Integer> q2 = new ArrayList<>();
        q2.add(1);
        q2.add(1);
        q2.add(1);
        List<Integer> q3 = new ArrayList<>();
        q3.add(1);
        q3.add(5);
        List<List<Integer>> query = new ArrayList<>();
        query.add(q1);
        query.add(q2);
        query.add(q3);
        System.out.println(coolFeature(a, b, query));
    }
}
