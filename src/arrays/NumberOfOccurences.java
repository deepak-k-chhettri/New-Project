package arrays;

import java.util.Scanner;

public class NumberOfOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]nums = new int[N];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = FirstAndLastOccurence.lastOccurence(nums, target)
        -FirstAndLastOccurence.firstOccurence(nums, target)+1;
        System.out.println(result);
        sc.close();
    }
}
