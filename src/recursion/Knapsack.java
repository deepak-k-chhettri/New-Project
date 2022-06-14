package recursion;

import java.util.Scanner;

public class Knapsack {
    
    public static int solve(int[]weights,int[]values,int W,int n) {
        if(n==0 || W==0)return 0;
        if(weights[n-1]<=W){
            return Math.max(values[n-1]+solve(weights, values, W-weights[n-1], n-1), solve(weights, values, W, n-1));
        }
        return solve(weights, values, W, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]weights = new int[n];
        int[]values = new int[n];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = sc.nextInt();
        }
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }
        int W = sc.nextInt();
        System.out.println(solve(weights, values, W, n));
        sc.close();
    }
}
