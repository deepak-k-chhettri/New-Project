package hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestArrayWithMultipleOfK {
    public static int solve(int[]arr,int n,int k) {
        ArrayList<Integer>pre = new ArrayList<>();
        pre.add(0,0);
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            pre.add(i+1,pre.get(i)<0?(pre.get(i)+arr[i])%k+k:(pre.get(i)+arr[i])%k);
        }
        
        int ans = 0;
        for (int i = 0; i <=n; i++) {
            int x = pre.get(i);
            if(map.containsKey(x)){
                ans = Math.max(ans, i-map.get(x));
            }
            else{
                map.put(x, i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr = {2,7,6,1,4,5};
        System.out.println(solve(arr, 6, 3));
    }
}
