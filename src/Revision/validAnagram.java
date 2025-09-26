package Revision;

public class validAnagram {
    public static boolean isValidAnagram(String s, String t) {
        //If both the String are of different then straight away false
        if(s.length() != t.length()) {
            return false;
        }
        //Stores the Count of Characters as Per the ASCII like for a lets say 97 , b = 98 like this
        int count[] = new int[26];
        for(int i = 0;i < s.length();i++) {
            //Calculating the Frequency of the count say 97-97 = 0 , 99-97 = 2 so like this we calculate for both s and t
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        //Iterate through the count array which has the overall count of s and t and check its zero is yes return true else return false
        for(int i : count) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean ans = isValidAnagram(s,t);
        System.out.println(ans);
    }
}
