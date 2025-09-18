package Blind75;

public class containerWithMostWater {
    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length-1;
        while(left <= right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, currentArea);
            if(height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        int ans = maxArea(height);
        System.out.println(ans);
    }
}
