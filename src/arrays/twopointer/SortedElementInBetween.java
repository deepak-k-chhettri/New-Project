package arrays.twopointer;

import java.io.IOException;
import java.util.Scanner;

public class SortedElementInBetween {
    public static int[] leftMax(int n,int[]arr) {
        int max = arr[0];
        int[]lm = new int[n];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            lm[i] = max;
        }
        for(int l:lm){
            System.out.print(l+" ");
        }
        System.out.println();
        return lm;
    }
    public static int[] rightMin(int n,int[]arr) {
        int min = arr[n-1];
        int[]rm = new int[n];
        for (int i = n-1; i >= 0; i--) {
            if(arr[i]<min){
                min = arr[i];
            }
            rm[i] = min;
        }
        for(int r:rm){
            System.out.print(r+" ");
        }
        System.out.println();
        return rm;
    }
    public static int solve(int n,int[] arr) {
        int[] LM = leftMax(n, arr);
        int[] RM = rightMin(n, arr);
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i]>=LM[i] && arr[i]<=RM[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(n, arr));
        sc.close();
    }
}
