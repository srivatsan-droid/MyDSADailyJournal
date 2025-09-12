package SortingAlgos;

public class SelectionSort {
    //In-Place Sorting
    public static void selectionSort(int[] arr) {
        // code here
        int size = arr.length;
        for(int i = 0;i < size - 2; i++) {
            int min = i;
            for(int j = i+1; j < size - 1; j++) {
                if(arr[j] < arr[min]) {
                    min = arr[j];
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 1, 3, 9, 7};
        selectionSort(arr);
    }
}
