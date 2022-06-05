package arrays.sorting;

import java.util.Scanner;

public class SortBinaryArray {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int[]arr = new int[2];
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<2;i++){
            while(arr[i]-->0 && j<n){
                nums[j] = i;
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortColors(arr);
        sc.close();
    }
}
