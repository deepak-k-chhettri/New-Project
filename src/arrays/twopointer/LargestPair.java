package arrays.twopointer;

import java.io.IOException;
import java.util.Scanner;

public class LargestPair {
    public static int[] solve(int n,int[]arr) {
        int[]res = new int[2];
        int max1 = Math.max(arr[0], arr[1]);
        int max2 = Math.min(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2){
                max2 = arr[i];
            }
        }
        res[0] = max1;
        res[1] = max2;
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
