package Arrays;

public class anagramValid {
    public static boolean valid(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int count[] = new int[26];
        for(int i = 0;i < s.length();i++) {
            count[s.charAt(i) - 'a']++;
            count[s.charAt(i) - 'a']--;
        }
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
        boolean ans = valid(s,t);
        System.out.println(ans);
    }
}
