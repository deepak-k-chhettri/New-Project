package arrays.sorting;

import java.util.Scanner;

public class SortColors {
    public static void sortColors(int[] nums) {
        int i=-1;
        int j=nums.length;
        int k = 0;
        while(k<j){
            if(nums[k]==0){
                i++;
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
            else if(nums[k]==2){
                j--;
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp; 
            }
            else{
                k++;
            }
        }
        for(int n:nums){
            System.out.print(n+" ");
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
