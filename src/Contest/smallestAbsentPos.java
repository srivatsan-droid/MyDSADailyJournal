package Contest;
import java.util.*;
public class smallestAbsentPos {
    public static int smallestAbsent(int[] nums) {
        int size = nums.length;
        int sum = 0;
        for(int i = 0;i < size;i++) {
            sum += nums[i];
        }
        double avg = (double) sum / size;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int candidate = (int) Math.round(avg) + 1;
        while(set.contains(candidate)) {
            candidate++;
        }
        return candidate;
    }
    public static void main(String[] args) {
        int nums[] = {3,5};
        int ans = smallestAbsent(nums);
        System.out.println(ans);
    }
}
