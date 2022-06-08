package recursion;

public class CheckPrime {
    public static boolean checkPrime(int n,int i) {
        if(n==2)return true;
        if(n==1)return false;
        if(i*i>n)return true;
        if(n%i==0)return false;
        return checkPrime(n, i+1);
    }
    public static void main(String[] args) {
        System.out.println(checkPrime(10, 2));
    }
}
