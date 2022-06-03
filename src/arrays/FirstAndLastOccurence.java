package arrays;

import java.util.Scanner;

public class FirstAndLastOccurence {
    public static int firstOccurence(int[] nums,int target){
        int low=0, high=nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>=target){
                if(nums[mid]==target){
                    ans = mid;
                }
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int lastOccurence(int[] nums,int target){
        int low = 0,high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]<=target){
                if(nums[mid]==target){
                    ans = mid;
                }
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static int[] searchRange(int[] nums, int target) {
        int[]res = new int[2];
        res[0] = firstOccurence(nums,target);
        res[1] = lastOccurence(nums,target);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]nums = new int[N];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] res = searchRange(nums, target);
        System.out.println("["+res[0]+","+res[1]+"]");
        sc.close();
    }
}
