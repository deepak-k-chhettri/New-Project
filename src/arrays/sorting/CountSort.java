package arrays.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import arrays.MaxElement;

public class CountSort {
    public static void solve(int[]arr) {
        int n = MaxElement.maxElement(arr);
        int[]freq = new int[n+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            while(freq[i]-->0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]s = br.readLine().split(" ");
        int[]arr = new int[s.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        solve(arr);
    }
}
