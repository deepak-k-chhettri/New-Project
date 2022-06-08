package arrays;

import java.util.Scanner;

public class FirstRepeatingElement {
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        int max = Integer.MIN_VALUE;
        int res = -1;
        for(int a:arr){
            max = Math.max(max,a);
        }
        int[] freq = new int[max+1];
        for(int a:arr){
            freq[a]++;
        }
        for(int i=0;i<n;i++){
            if(freq[arr[i]]>1){
                res = i+1;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(firstRepeated(arr, n));
        sc.close();
    }
}
