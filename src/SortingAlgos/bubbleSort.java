package SortingAlgos;

public class bubbleSort {
    public static void sortBubble(int arr[]) {
        int size = arr.length;
        int didSwap = 0;
        for(int i = size - 1; i >= 0; i--) {
            for(int j = 0;j <= i-1; j ++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
       sortBubble(arr);

    }
}
