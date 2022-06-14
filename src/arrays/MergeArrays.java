package arrays;

import java.util.Scanner;

public class MergeArrays {
    public static int[] solve(int[]a1,int[]a2,int n,int m) {
        int[]res = new int[m+n];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(a1[i]<a2[j]){
                res[k++] = a1[i++];
            }
            else{
                res[k++] = a2[j++];
            }
        }
        while(i<n){
            res[k++] = a1[i++];
        }
        while(j<m){
            res[k++] = a2[j++];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[]a1 = new int[n];
        int[]a2 = new int[m];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        } 
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        int[]res = solve(a1, a2, n, m);
        for (int i : res) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
