package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static boolean canBePlaced(int C,int[]arr,int N,int X) {
        if(C>N){
            return false;
        }
        int prev = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(prev+X<=arr[i]){
                count++;
                prev = arr[i];
            }
        }
        return count>=C;
    }
    public static int solve(int N,int C,int[] arr) {
        Arrays.sort(arr);
        int ans = 0;
        int low = arr[0];
        int high = arr[N-1];
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canBePlaced(C, arr, N, mid)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int C = sc.nextInt();
            int[]arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(solve(N, C, arr));
        }
        sc.close();
    }
}
