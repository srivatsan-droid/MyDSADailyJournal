package Arrays;
import java.util.*;

public class anagramsgroup {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Step 1: Create a HashMap to group anagrams
        HashMap<String, List<String>> map = new HashMap<>();

        // Step 2: Iterate through each string in the array
        for (String str : strs) {
            // Step 3: Sort the characters of the string to form the key
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);

            // Step 4: Add the string to its corresponding group in the HashMap
            map.putIfAbsent(sortedKey, new ArrayList<>());
            map.get(sortedKey).add(str);
        }

        // Step 5: Return the grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
