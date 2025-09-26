package Revision;

import java.util.HashMap;

public class majorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i < n;i++) {
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
        }
        int freq = n/2;
        for(int key : freqMap.keySet()) {
            if(freqMap.get(key) > freq) {
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }
}
