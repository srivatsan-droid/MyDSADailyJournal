package Arrays;
import java.util.*;
public class removeElement {
    public static int removeElement(int[] nums, int val) {
        int index = 0; // position for next non-val element
        for (int num : nums) {
            if (num != val) {
                nums[index++] = num;
            }
        }
        return index; // length of filtered array
    }
    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        int ans = removeElement(nums, val);
        System.out.println(ans);
    }
}
