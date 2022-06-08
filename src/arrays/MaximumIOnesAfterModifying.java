package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumIOnesAfterModifying {
    public static int solve(ArrayList<Integer> A, int B) {
        int max = -1;
        int i=0;
        int j=0;
        int cnt = 0;
        int n = A.size();

        if(n==1){
            if(B>0)return 1;
            else return A.get(0);
        }
        for(j=0;j<n;j++){
            if(A.get(j)==0)cnt++;
            while(cnt>B){
                if(A.get(i)==0)cnt--;
                i++;
            }
            max = Math.max(max,j-i+1);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>A = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        int B = sc.nextInt();
        System.out.println(solve(A, B));
        sc.close();
    }
}
