package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class AllocateBooks {
    public static int util(ArrayList<Integer>A,int X){
        int c=1;
        int val = A.get(0);
        for(int i=1;i<A.size();i++){
            int a = A.get(i);
            if(val+a>X){
                c++;
                val = a;
            }
            else{
                val+=a;
            }
        }
        return c;
    }
    public static int books(ArrayList<Integer> A, int B) {
        int l = Integer.MIN_VALUE;
        int h = 0;

        for(int i=0;i<A.size();i++){
            int a = A.get(i);
            l = Math.max(l,a);
            h+=a;
        }
        if(B>A.size()){
            return -1;
        }
        int ans = -1;
        while(l<=h){
            int m = l+(h-l)/2;
            int y = util(A,m);
            if(y<=B){
                ans = m;
                h = m-1;
            }
            else{
                l = m+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>A = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        int B = sc.nextInt();
        System.out.println(books(A, B));
        sc.close();
    }
}
