package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majorityElementII {
    public static List<Integer> majorityElement(int nums[]) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int freq = nums.length / 3;
        for(int key : map.keySet()) {
            if(map.get(key) > freq) {
                result.add(key);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,3};
        List<Integer> ans = majorityElement(nums);
        for(int n : ans) {
            System.out.println(n);
        }
    }
}
