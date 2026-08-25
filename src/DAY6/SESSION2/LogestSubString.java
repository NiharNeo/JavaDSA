package DAY6.SESSION2;


import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LogestSubString {

    public static int lengthOfLongestSubstring(String s) {
        int maxCout=0;

        int n = s.length();

        Set<Character> set = new HashSet();
        int left=0;
       // int right =0;

        for(int right =0;right<n;right++){
            char current =s.charAt(right);
            while(set.contains(current)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            maxCout= Math.max(maxCout, right-left+1);
        }

    return maxCout;
    }

    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
