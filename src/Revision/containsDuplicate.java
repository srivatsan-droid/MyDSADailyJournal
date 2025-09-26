package Revision;

import java.util.HashMap;

public class containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        boolean ans = false;
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i],0)+1);
        }
        int freq = 2;
        for(int key : freqMap.keySet()) {
            if(freqMap.get(key) >= freq) {
                ans = true;
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
