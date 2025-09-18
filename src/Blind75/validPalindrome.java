package Blind75;

public class validPalindrome {
    public static boolean isPalindrome(String s) {
        //String is said to be Palindrome
        String cleanedString = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int size = cleanedString.length();
        int start = 0,end = size-1;
        while(start <= end) {
            if(cleanedString.charAt(start) != cleanedString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "race a car";
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }
}
