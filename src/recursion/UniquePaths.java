package recursion;

public class UniquePaths {
    public static int solve(int m,int n) {
        if(m==1 || n==1)return 1;
        return solve(m-1,n)+solve(m,n-1);
    }
    public static void main(String[] args) {
        System.out.println(solve(3,7));
    }
}
