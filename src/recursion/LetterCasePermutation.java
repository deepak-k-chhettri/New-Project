package recursion;

public class LetterCasePermutation {
    public static void solve(String s,int i,StringBuffer temp) {
        if(i==s.length()){
            System.out.println(temp);
            return;
        }
        solve(s, i+1, temp.append(Character.toUpperCase(s.charAt(i))));
        temp.deleteCharAt(temp.length()-1);
        solve(s, i+1, temp.append(Character.toLowerCase(s.charAt(i))));
        temp.deleteCharAt(temp.length()-1);
    }
    public static void main(String[] args) {
        String s = "abc";
        StringBuffer temp = new StringBuffer("");
        solve(s,0,temp);
    }
}
