package recursion;

import java.util.Scanner;

public class PowerOfTwo {
    public static boolean isPower(int n) {
        if(n==1)return true;
        boolean flag = false;
        if(n%2==0)
            flag=true;
        return flag & isPower(n/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPower(Math.abs(n)));
        sc.close();
    }
}
