package Blind75;

public class buySellStock {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0;i < prices.length;i++) {
            for(int j = i+1;j<prices.length;j++) {
                maxProfit = Math.max(maxProfit,prices[j] - prices[i]);
            }
        }
        return maxProfit;
    }
    public static int maxProfitOpti(int nums[]) {
        int minPrice = nums[0];
        int maxProfit = 0;
        for(int i = 1; i<nums.length;i++) {
            if(nums[i] < minPrice) {
                minPrice = nums[i];
            }
            else {
                maxProfit = Math.max(maxProfit,minPrice);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        int ans = maxProfit(nums);
        System.out.println(ans);
        int ans1 = maxProfitOpti(nums);
        System.out.println(ans1);
    }
}
