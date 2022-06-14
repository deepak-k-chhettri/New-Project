package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsetsOfSet {
    public static void subsets(ArrayList<Integer>set,int n,int i,ArrayList<Integer>temp) {
        if(i==n){
            System.out.println(temp);
            return;
        }
        subsets(set, n, i+1, temp);
        temp.add(set.get(i));
        subsets(set, n, i+1, temp);
        temp.remove(temp.size()-1);
    }
    public static void solve(ArrayList<Integer>set) {
        int n = set.size();
        ArrayList<Integer>temp = new ArrayList<>();
        subsets(set, n, 0,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> set = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        solve(set);
        sc.close();
    }
}
