package Blind75;

public class minInSortedArray {
    public static int findMinBrute(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
    public static int findMinimum(int nums[]) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] > nums[h]) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return nums[l];
    }
    public static void main(String[] args) {
        int arr[]  = {3,4,5,1,2};
        int ans = findMinBrute(arr);
        System.out.println(ans);
        int result = findMinimum(arr);
        System.out.println(ans);
    }
}
