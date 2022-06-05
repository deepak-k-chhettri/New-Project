package arrays.sorting;

import java.util.Scanner;

public class SortColors {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int[]arr = new int[3];
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<3;i++){
            while(arr[i]-->0 && j<n){
                nums[j] = i;
                j++;
            }
        }
        System.out.print("[");
        for(int i=0;i<n-1;i++){
            System.out.print(nums[i]+",");
        }
        System.out.print(nums[n-1]+"]");
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
