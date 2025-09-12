package Arrays;

import java.util.HashMap;

/*
Given an array nums of size n return the majority element 
The majority element is the element that appears more than n/2 times
 */
public class majorityElement {
    public static int majority(int nums[]) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int freq = n / 2;
        for(int key : map.keySet()) {
            if(map.get(key) > freq) {
                return key;
            }
        }
        return -1;
    }
    //Driver Code
    public static void main(String[] args) {
        int nums[] = {3,2,3};
        int ans = majority(nums);
        System.out.println(ans);
    }
}
