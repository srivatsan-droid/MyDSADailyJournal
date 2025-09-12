package SortingAlgos;

import java.util.ArrayList;

public class mergeSort {
    public static int[] sortColors(int[] nums) {
        int n = nums.length;
        mergeSort(nums,0,n-1);
        return nums;
    }
    public static void mergeSort(int arr[], int low , int high) {
        if(low ==  high) return;
        int mid = (low + high) / 2;
        mergeSort(arr,low,mid);//From low till mid we try to divide the array based on index
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        //[low -- mid]
        //[mid + 1 ... high]
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high) {
            if(arr[left]  <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while(right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for(int i = low ; i <= high ;i++) {
            arr[i] = temp.get(i-low);
        }
    }
    public static void main(String[] args) {
        int nums[] = {4, 3, 2, 1};
        int ans[]  = sortColors(nums);
        System.out.println(ans);
    }
}
