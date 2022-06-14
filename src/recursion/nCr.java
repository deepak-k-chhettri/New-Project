package recursion;

public class nCr {
    public static int solve(int n,int r) {
        if(r>n)return 0;
        if(r==0 || r==n)return 1;
        return solve(n-1,r-1)+solve(n-1, r);
    }
    public static void main(String[] args) {
        System.out.println(solve(2, 1));
    }
}
