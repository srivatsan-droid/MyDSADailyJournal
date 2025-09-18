package Arrays;

public class productarray {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: Calculate prefix product for each element
        answer[0] = 1; // Prefix product of the first element is 1
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate suffix product and multiply with prefix
        int suffix = 1; // Suffix product starts as 1
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix; // Multiply suffix with prefix
            suffix *= nums[i]; // Update suffix product
        }

        return answer;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int ans[] = nums;
        System.out.println(ans);
    }
}
