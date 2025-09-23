package Blind75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutRepeatingchars {
    public static int lengthOfLongestSubstringBrute(String s) {
        int size = s.length();
        int max = 0;
        for(int i = 0;i < size;i++) {
            Set<Character> freq = new HashSet<>();
            for(int j = i+1;j <size;j++) {
                if(freq.contains(s.charAt(j))) {
                    break;
                }
                freq.add(s.charAt(j));
                max = Math.max(max,j-i+1);
            }
        }
        return max;
    }
    public static int longestOptimized(String s) {
        int start = 0,end = 0;
        int max = Math.max(s.length(),1);
        Set<Character> seen = new HashSet<>();
        while(end < s.length()) {
            char currentSeenCharacter = s.charAt(end);
            while(seen.contains(currentSeenCharacter)) {
                seen.remove(currentSeenCharacter);
                start++;
            }
            seen.add(currentSeenCharacter);
            end++;
            int windowSize = end -start + 1;
            max = Math.max(max, windowSize);
        }
        return max;
    }
    public static int lengthOpti(String s) {
        HashMap<Character,Integer> map = new HashMap<>(); //To check if an Character is already present in map so we calculate the frequency of it
        int max = 0,start = 0;
        int size = s.length();
        for(int end = 0; end < size; end++) {
            char currentchar = s.charAt(end);
            if(map.containsKey(currentchar)) {
                start = Math.max(start, map.get(currentchar) + 1);
            }
            map.put(currentchar,end);
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstringBrute(s);
        System.out.println(ans);
        int result = lengthOpti(s);
        System.out.println(ans);
        int opti = longestOptimized(s);
        System.out.println(ans);
    }
}
