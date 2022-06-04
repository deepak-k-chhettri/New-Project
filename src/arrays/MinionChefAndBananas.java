package arrays;

import java.util.Scanner;

public class MinionChefAndBananas {
    public static boolean canBeEaten(int[]arr,int H,int X) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count+=arr[i]/X;
            if(arr[i]%X>0){
                count++;
            }
        }
        return count<=H;
    }
    public static int solve(int[]arr,int H) {
        int ans = 0;
        int low = 1;
        int high = MaxElement.maxElement(arr);
        if(arr.length==H){
            return high;
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canBeEaten(arr,H,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int H = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(solve(arr, H));
        }
        sc.close();
    }
}
