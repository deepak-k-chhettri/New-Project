package arrays;

import java.util.*;



public class Combination {
    public static int solve(int[]arr,int n,int k){
        if(n<3){
            return 0;
        }
        Arrays.sort(arr);
        int i = 0;
        int j = n-1;
        int l = 1;
        int cnt = 0;
        while(l<j && i<j && i!=j && j!=l && i!=l){
            if(arr[i]+arr[j]+arr[l]==k){
                cnt++;
                l++;
            }
            else if(arr[i]+arr[j]+arr[l]>k){
                j--;
            }
            else{
                i++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(solve(arr,n,k));
        sc.close();
    }
} 