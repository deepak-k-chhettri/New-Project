package recursion;

public class SumOfDigits {
    public static int sum(int n) {
        int sum = 0;
        if(n==0)return 0;
        return sum+=n%10+sum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sum(1234567890));
    }
}
