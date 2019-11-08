package Quora;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaxArithmeticLength {
    public static int maxArithmeticLength(int[] a, int[] b) {
        int sol = -1;
        Arrays.sort(a);
        Arrays.sort(b);
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        for (int i=1; i<a.length; i++) setA.add(a[i]);
        for (int n : b) setB.add(n);
        int start = a[0];
        int maxDiff = Integer.MAX_VALUE;
        for (int i=0; i<a.length-1; i++)
            maxDiff = Math.min(maxDiff, a[i+1]-a[i]);
        if (a.length>=2)
            sol = Math.max(sol, check(a[1]-start, start, maxDiff, setA, setB));
        for (int i : b)
            sol = Math.max(sol, check(Math.abs(i-start), start, maxDiff, setA, setB));
        return sol;
    }

    private static int check(int diff, int start, int maxDiff, Set<Integer> setA, Set<Integer> setB) {
        if (diff>maxDiff) return -1;
        int i = 1;
        int sizeB = setB.size();
        int sizeA = setA.size()+1;
        while (setA.contains(diff*i+start) || setB.contains(diff*i+start)) {
            if (setA.contains(diff*i+start) && setB.contains(diff*i+start)) {
                setA.remove(diff*i+start);
            } else if (setA.contains(diff*i+start)) {
                setA.remove(diff*i+start);
            } else {
                setB.remove(diff*i+start);
            }
            i++;
        }
        i = -1;
        while (setA.contains(diff*i+start) || setB.contains(diff*i+start)) {
            if (setA.contains(diff*i+start) && setB.contains(diff*i+start)) {
                setA.remove(diff*i+start);
            } else if (setA.contains(diff*i+start)) {
                setA.remove(diff*i+start);
            } else {
                setB.remove(diff*i+start);
            }
            i--;
        }
        if (setA.isEmpty()) return sizeB - setB.size() + sizeA;
        else return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0,4,8,20};
        int[] b = new int[]{5,7,12,16,22};
        System.out.println(maxArithmeticLength(a, b));
    }
}
