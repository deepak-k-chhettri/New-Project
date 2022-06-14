package hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class LargestArrayWith0Sum {
    public static int solve(int[]arr,int n) {
        ArrayList<Integer>pre = new ArrayList<>();
        pre.add(0,0);
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            pre.add(i+1,pre.get(i)+arr[i]);
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
        int[]arr = {2,2,4,-1,-3};
        System.out.println(solve(arr, 5));
    }
}
