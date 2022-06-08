package arrays.sorting;

import java.util.Scanner;

public class RotatedSortedArray {
    public static int solve(int[]nums,int target) {
        int l = 0;
        int h = nums.length-1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(nums[m]==target){
                return m;
            }
            if(nums[m]>=nums[l]){
                if(target>=nums[l] && target<nums[m]){
                    h=m-1;
                }
                else{
                    l=m+1;
                }
            }
            else{
                if(target>=nums[m] && target<=nums[h]){
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(solve(nums, target));
        sc.close();
    }
}
