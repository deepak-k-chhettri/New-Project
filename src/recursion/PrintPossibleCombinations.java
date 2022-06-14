package recursion;

import java.util.ArrayList;

public class PrintPossibleCombinations {
    public static void solve(int[]arr,int n,int target) {
        ArrayList<Integer>res = new ArrayList<>();
        if(n==0 || target==0){
            System.out.println(res);
            return;
        }
        if(arr[n-1]<=target) {
            solve(arr, n , target-arr[n-1]);
            res.add(arr[n-1]);
        }
        else solve(arr, n-1, target);
    }
    public static void main(String[] args) {
        int[]arr = {1,2,8};
        solve(arr, 3, 12);
    }
}
