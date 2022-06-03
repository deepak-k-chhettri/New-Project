package arrays;

import java.util.Scanner;

public class SquareRootBinarySearch {
    public static double solve(double n) {
        final double DIFF = 10e-5;
        double start = 0;
        double end = n;
        while(end>=start){
            double mid = start+(end-start)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid>n){
                end = mid-DIFF;
            }else{
                start = mid+DIFF;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println(solve(n));
        sc.close();
    }
}