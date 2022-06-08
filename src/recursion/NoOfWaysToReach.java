package recursion;

import java.util.Scanner;

public class NoOfWaysToReach {
    public static int recursive(int n) {
        if(n==1 || n==2){
            return n;
        }
        return recursive(n-1)+recursive(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursive(n));
        sc.close();
    }
}
