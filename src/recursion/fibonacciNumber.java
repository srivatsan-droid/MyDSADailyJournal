package recursion;

public class fibonacciNumber {
    public static int fibo(int n) {
        if(n <= 1) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = fibo(n);
        System.out.println(ans);
    }
}
