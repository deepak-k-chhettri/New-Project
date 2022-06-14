package recursion;

public class CoinChange {
    public static int solve(int[]arr,int n,int target) {
        if(n==0 || target==0)return 0;
        if(arr[n-1]<=target) return 1+solve(arr, n, target-arr[n-1]);
        return solve(arr, n-1, target);
    }
    public static void main(String[] args) {
        int[]arr = {3};
        int target = 2;
        System.out.println(solve(arr, arr.length, target));
    }
}
