package Blind75;
import java.util.*;

public class threeSum {
    //Brute Force
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet); // to avoid duplicates in different order
                        if (!result.contains(triplet)) {
                            result.add(triplet);
                        }
                    }
                }
            }
        }
        return result;
    }
    public static List<List<Integer>> threeSumOpti(int nums[]) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Step 1: sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate i values
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // need bigger number
                } else {
                    right--; // need smaller number
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        threeSum ts = new threeSum();
        int nums [] = {-1, 0, 1, 2, -1, -4};
        System.out.println(ts.threeSum(nums));
        System.out.println(ts.threeSumOpti(nums));
    }
}
