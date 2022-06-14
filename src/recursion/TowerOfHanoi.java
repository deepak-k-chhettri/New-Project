package recursion;

public class TowerOfHanoi {
    public static void solve(int n, int src, int aux, int des) {
        if (n > 0) {
            solve(n - 1, src, des, aux);
            System.out.println(src + " " + des);
            solve(n - 1, aux, src, des);
        }
    }

    public static void main(String[] args) {
        solve(5, 1, 2, 3);
    }
}
