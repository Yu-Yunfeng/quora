package Quora;

import java.util.HashSet;
import java.util.Set;

public class DivisorSubstrings {
    public static int divisorSubstring(int n, int k) {
        String num = Integer.toString(n);
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<=num.length()-k; i++) {
            String substring = num.substring(i, i+k);
            int subnum = Integer.parseInt(substring);
            if (subnum!=0 && n%subnum==0) set.add(subnum);
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(divisorSubstring(120,2));
        System.out.println(divisorSubstring(555,1));
    }
}
