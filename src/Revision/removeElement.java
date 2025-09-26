package Revision;

public class removeElement {
    public static int remove(int nums[], int val) {
        //To find the elements excluding the val from the nums
        int index = 0;
        for(int num: nums) {
            if(num != val) {
                nums[index++] = num;
            }
        }
        return index;//Length of the Filtered elements
    }
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 3;
        int ans = remove(nums,val);
        System.out.println("After removal the array length is : " + ans);
    }
}
