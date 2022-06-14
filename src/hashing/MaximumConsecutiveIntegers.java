package hashing;

import java.util.HashMap;

public class MaximumConsecutiveIntegers {
    public static int solve(int[]arr,int n) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], 1);
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            if(map.get(arr[i]-1)==0){
                int c = 1;
                int x = arr[i];
                while(map.get(x+1)>0){
                    c++;
                    x++;
                }
                ans = Math.max(ans, c);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr = {2,6,1,9,4,5,3};
        System.out.println(solve(arr, 7));
    }
}
