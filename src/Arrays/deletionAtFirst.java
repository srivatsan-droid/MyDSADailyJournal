package Arrays;

public class deletionAtFirst {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        for(int i = 0; i< n;i++) {
            System.out.println(arr[i]);
        }
        for(int i = 1; i < n;i++) {
            arr[i-1] = arr[i];
            System.out.println(arr[i]);
        }
    }
}
