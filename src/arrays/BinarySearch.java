package arrays;

import java.util.Scanner;

public class BinarySearch {
    public static int solve(int n,int[]arr,int key) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == key)
                return m;
            if (arr[m] < key)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(solve(n, arr,key));
        sc.close();
    }
}
