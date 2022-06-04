package arrays.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionSort {
    public static int[] solve(int[]arr) {
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
                arr[j+1] = key;
            }

        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]s = br.readLine().split(" ");
        int[]arr = new int[s.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        arr = solve(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
