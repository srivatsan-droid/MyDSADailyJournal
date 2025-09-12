package Arrays;

public class traversal {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int size = arr.length;
        for(int i = 0; i < size ;i++) {
            System.out.println(arr[i] + " ");
        }
        //Reverse Order Printing
        for(int i = size - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
        //While Loop traversal
        int j = 0;
        while(j < size) {
            System.out.println(arr[j] + " ");
            j++;
        }
        System.out.println();
        //Range based For Loop
        for(int val : arr) {
            System.out.println(arr[val] + "  ");
        }
    }
}
