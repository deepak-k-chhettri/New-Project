package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindTripletSum {
    public static boolean twoSum(int A[],int n,int i,int target){
        int first = i;
        int second = n-1;
        boolean flag = false;
        while(first<second){
            if((A[first]+A[second])==target){
                flag = true;
                break;
            }
            else if((A[first]+A[second])>target){
                second--;
            }
            else{
                first++;
            }
        }
        return flag;
    }
    public static int solve(int A[], int n, int X) { 
    
       // Your code Here
        if(n<3)return 0;
        int cnt = 0;
        Arrays.sort(A);
        for(int i=0;i<n-2;i++){
            int target = X-A[i];
            if(twoSum(A,n,i,target)){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        System.out.println(solve(arr, n, X));
        sc.close();
    }
}
