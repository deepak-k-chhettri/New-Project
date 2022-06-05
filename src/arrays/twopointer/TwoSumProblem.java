package arrays.twopointer;

import java.io.IOException;
import java.util.Scanner;

public class TwoSumProblem {
    public static int[] solve(int n,int[]arr,int target){
        int[]res = new int[2];
        res[0] = -1;
        res[1] = -1;
        int first = 0;
        int second = n-1;
        while(first<second){
            if((arr[first]+arr[second])==target){
                res[0] = first;
                res[1] = second;
                break;
            }
            else if((arr[first]+arr[second])>target){
                second--;
            }
            else{
                first++;
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
        int target = sc.nextInt();
        int[]res = solve(n,arr,target);
        for(int a:res){
            System.out.print(a+" ");
        }
        sc.close();
    }
}
