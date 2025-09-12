package Arrays;
import java.util.*;
public class containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        boolean ans = false;
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            countMap.put(nums[i],countMap.getOrDefault(nums[i],0) + 1);
        }
        int freq = 2;
        for(int key : countMap.keySet()) {
            if(countMap.get(key) >= freq) {
                ans = true;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }
}
