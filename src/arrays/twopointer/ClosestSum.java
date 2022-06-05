package arrays.twopointer;

import java.io.IOException;
import java.util.Scanner;

public class ClosestSum {
    public static int[] solve(int n,int[]arr) {
        int i = 0;
        int j = n-1;
        int sum = 0, minSum = Integer.MAX_VALUE;
        int[]res = new int[2];
        while(i<j){
            sum = arr[i]+arr[j];
            minSum = Math.min(minSum, Math.abs(sum));
            if(sum>0){
                j--;
            }
            else if(sum<0){
                i++;
            }
            if(arr[i]+arr[j]==minSum){
                res[0] = arr[i];
                res[1] = arr[j];
            }
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[]res = solve(n,arr);
        for(int a:res){
            System.out.print(a+" ");
        }
        sc.close();
    }
}
