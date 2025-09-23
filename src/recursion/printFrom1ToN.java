package recursion;

public class printFrom1ToN {
    static void printTillN(int N) {
        if (N < 1) {
            return;
        }
        System.out.print(N + " "); // ✅ use print instead of println
        printTillN(N - 1);
    }

    public static void main(String[] args) {
        int N = 5;
        printTillN(N);
    }
}
