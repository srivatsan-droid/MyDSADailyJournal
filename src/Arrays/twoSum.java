package Arrays;

import java.util.HashMap;

public class twoSum {
    public static int[] twoSum1(int nums[], int target) {
        HashMap<Integer,Integer> map = new HashMap<>(); //O(1)>
        for(int i = 0;i<nums.length;i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                return new int[] {map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        int ans[] = twoSum1(arr,target);
        System.out.println(ans);
    }
}
