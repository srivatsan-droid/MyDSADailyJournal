package Blind75;

public class searchInRotatedSortedArray {
    public static int searchBrute(int[] nums, int target) {
        int size = nums.length;
        for(int i = 0;i < size;i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int searchOptimized(int nums[], int target) {
        int l = 0, h = nums.length-1;
        while(l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if(nums[l] <= nums[mid]) {
                if(nums[l] <= target && target <= nums[h]) {
                    h = mid - 1; //Target is in left half
                }
                else {
                    l = mid + 1;
                }
            }
            else {
                if(nums[mid] <= target && target <= nums[h]) {
                    l = mid + 1;
                }
                else {
                    h = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = searchBrute(arr,target);
        System.out.println(ans);
        int result = searchOptimized(arr,target);
        System.out.println(result);
    }
}
