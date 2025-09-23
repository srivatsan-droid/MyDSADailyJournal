package recursion;

public class baseCode {
    public static void print() {
        System.out.println(1);
        print();
    }
    public static void incrementCount(int cnt) {
        if (cnt == 5) {
            return;
        }
        System.out.println(cnt);
        incrementCount(cnt + 1);
    }

    public static void main(String[] args) {
//        print();
        incrementCount(0);
    }
}
