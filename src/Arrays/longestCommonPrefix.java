package Arrays;
import java.util.*;
public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int size = strs.length;
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        String firstChar = strs[0];
        String lastChar = strs[size - 1];
        for(int i = 0; i <  Math.min(firstChar.length(), lastChar.length()); i++) {
            if(firstChar.charAt(i) != lastChar.charAt(i)) {
                return result.toString();
            }
            result.append(firstChar.charAt(i));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        String ans = longestCommonPrefix(strs);
        System.out.println(ans);
    }

}
