package arrays;

import java.util.Scanner;

public class SearchInsertPosition {
    public static int solve(int n,int[]nums,int target) {
        int start = 0,end = n-1;
        int mid = 0;
        while(start<=end){
            mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if(nums[mid]<target){
            return mid+1;
        }
        else{
            return mid;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(solve(n, nums,target));
        sc.close();
    }
}
