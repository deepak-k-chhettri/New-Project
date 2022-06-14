package recursion;

public class TilesProblem {
    public static int solve(int c) {
        if(c==1 || c==2)return c;
        return solve(c-1)+solve(c-2);
    }
    public static void main(String[] args) {
        System.out.println(solve(4));
    }
}
