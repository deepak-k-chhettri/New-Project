package recursion;

public class AddNumbers {
    public static int solve(String s1,String s2,int i,StringBuilder res) {
        if(i>=s1.length())return 0;
        int x = solve(s1, s2, i+1, res);
        int p = Integer.parseInt(s1.substring(i))+Integer.parseInt(s2.substring(i))+x;
        res.append(p%10);
        return p/10;
    }
    public static void main(String[] args) {
        String s1 = "4321";
        String s2 = "1234" ;
        StringBuilder res = new StringBuilder("");
        solve(s1, s2, 0, res);
        res.reverse();
        System.out.println(res);
    }
}
