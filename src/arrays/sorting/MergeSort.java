package arrays.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void merge(int[]arr,int l,int mid,int r) {
        int[]res = new int[r-l+1];
        int i=l,j=mid+1,k=0;
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                res[k++] = arr[i++];
            }else{
                res[k++] = arr[j++];
            }
        }
        while(i<=mid){
            res[k++] = arr[i++];
        }
        while(j<=r){
            res[k++] = arr[j++];
        }
        arr = Arrays.copyOf(res, res.length);
    }
    public static void solve(int[]arr,int l,int r) {
        if(l==r){
            return;
        }
        int mid = l+(r-l)/2;
        solve(arr, l, mid);
        solve(arr, mid+1, r);
        merge(arr, l, mid, r);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        solve(arr, 0, n-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
