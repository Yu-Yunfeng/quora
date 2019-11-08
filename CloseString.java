package Quora;

import java.util.*;
import java.io.*;

class CloseString{
    public static boolean isCloseString(String S1, String S2){
        if(S1 == null && S2 == null) return true;
        if(S1 == null || S2 == null || S1.length() != S2.length()) return false;
        //It is also a good idea to use int[] array to store frequency here.

        // int[] freq1 = new int[26];
        // int[] freq2 = new int[26];
        // for(int i = 0; i < S1.length; ++i){
        //     freq1[S1.charAt(i) - 'a']++;
        //     freq2[S2.charAt(i) - 'a']++;
        // }
        // for(int i = 0; i < 26; ++i){
        //     if((freq1[i] != 0 && freq2[i] == 0) || (freq1[i] == 0 && freq2[i] != 0)) return false;
        // }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < S1.length(); ++i){
            map1.put(S1.charAt(i), map1.getOrDefault(S1.charAt(i), 0)+1);
            map2.put(S2.charAt(i), map2.getOrDefault(S2.charAt(i), 0)+1);
        }
        if(!map1.keySet().equals(map2.keySet())) return false;

        Map<Integer, Integer> freq1 = new HashMap<>();
        Map<Integer, Integer> freq2 = new HashMap<>();
        for(int i : map1.values()){
            freq1.put(i, freq1.getOrDefault(i, 0)+1);
            System.out.println(i);
        }
        for(int i : map2.values()){
            freq2.put(i, freq2.getOrDefault(i, 0)+1);
            System.out.println(i);
        }
        return freq1.equals(freq2);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S1 = in.nextLine();
        String S2 = in.nextLine();
        System.out.println(isCloseString(S1, S2));
        in.close();
    }
}