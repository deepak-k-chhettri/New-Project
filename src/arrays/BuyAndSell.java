package arrays;

import java.util.Scanner;

public class BuyAndSell {
    public static int solve(int n,int[]arr) {
        int min = arr[0];
        int maxProfit = 0;
        for(int i=0;i<n;i++){
            if(arr[i]-min>maxProfit){
                maxProfit = arr[i]-min;
            }
            min = Math.min(min, arr[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(n, arr));
        sc.close();
    }
}
