package recursion;

import java.util.Scanner;

public class Exponential {
    public static int nToX(int n,int x) {
        if(x==0){
            return 1;
        }
        return n*nToX(n,x-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        if(x<0){
            System.out.println(1.0/nToX(n,Math.abs(x)));
        }
        else{
            System.out.println(nToX(n,x));
        }
        sc.close();
    }
}
