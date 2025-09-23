package recursion;

public class checkPalindrome {
    public static boolean valid(String s) {
        int l = 0, r = s.length()-1;
        while(l >= r) {
            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "madam";
        boolean ans = valid(s);
        System.out.println(ans);
    }
}
