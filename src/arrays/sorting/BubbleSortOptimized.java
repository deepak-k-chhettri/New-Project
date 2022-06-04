package arrays.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSortOptimized {
    public static int[] solve(int[]arr) {
        for(int i=0;i<arr.length-1;i++){
            boolean flag = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag==false){
                break;
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
