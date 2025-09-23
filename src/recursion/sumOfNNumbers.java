package recursion;

public class sumOfNNumbers {
    public static int sum(int n) {
        if (n == 0) {
            return 0;  // base case
        }
        return n + sum(n - 1);  // recursive step
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum(n));  // prints 6
    }
}
