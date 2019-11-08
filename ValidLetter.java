package Quora;

import java.util.HashSet;
import java.util.Set;

public class ValidLetter {
    public static int validLetter(String a, char[] b) {
        if (b==null || b.length==0 || a==null || a.length()==0)
            return 0;
        int count = 0;
        Set<Character> set = new HashSet<Character>();
        for (char c : b) set.add(c);
        boolean f = true;
        a = a.toLowerCase();
        char[] aarr = a.toCharArray();
        for (int i = 0; i<a.length(); i++) {
            char c = aarr[i];
            if (i!=0 && (c<'a' || c>'z')) {

                if (f) {
                    count++;
                }
                else f = true;
            }
            while((aarr[i]<'a' || aarr[i]>'z') && i<a.length()-1) i++;
            if (i>=a.length()) return count;
            c = aarr[i];
            if (!f) continue;
            if (!set.contains(c)) {
                f = false;
            }
        }
        return count;
    }

    public static int getValidWords(String sentence, char[] validCharacters){
        if(sentence == null || sentence.length() == 0 || validCharacters.length == 0) return 0;
        String[] words = sentence.split("[^A-Za-z]");
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(char c : validCharacters) set.add(Character.toLowerCase(c));
        for(String word : words){
            if(word.length() == 0) continue;
            boolean flag = true;
            for(char cur : word.toCharArray()){
                if(Character.isLetter(cur) && !set.contains(Character.toLowerCase(cur))){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        char[] v1 = new char[]{'h','e','l','o','m'};
        System.out.println(validLetter("Hello, my dear friend!", v1));
        System.out.println(getValidWords(",.Hello, my dear friend!", v1));
    }
}
