package recursion;

public class reverseAnArray {

    public void reverseArray(int arr[]) {
        reverseHelper(arr, 0, arr.length - 1); // call helper
    }

    private void reverseHelper(int arr[], int l, int r) {
        if (l >= r) {
            return; // base case
        }

        // swap
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        // recursive call
        reverseHelper(arr, l + 1, r - 1);
    }

    public static void main(String[] args) {
        reverseAnArray obj = new reverseAnArray();
        int arr[] = {1, 2, 3, 4};
        obj.reverseArray(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
