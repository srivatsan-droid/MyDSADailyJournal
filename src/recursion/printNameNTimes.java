package recursion;

public class printNameNTimes {
    static void printGfg(int N) {
        // code here
        if(N < 1) {
            return;
        }
        System.out.print("GFG ");
        printGfg(N - 1);
    }
    public static void main(String[] args) {
        int n = 3;
        printGfg(n);
    }
}
