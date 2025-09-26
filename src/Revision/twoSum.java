package Revision;

import java.util.HashMap;

public class twoSum {
    public static int[] twoSum1(int nums[],int target) {
        int size = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < size;i++) {
            int diff = nums[i] - target;
            if(map.containsKey(diff)) {
                return new int[] {map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        int ans[] = twoSum1(nums,target);
        System.out.println("The target is present at : " + ans);
    }
}
