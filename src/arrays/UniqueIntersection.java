package arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueIntersection {
    public static Object[] solve(int[]nums1,int[]nums2) {
        Set<Integer>s1 = new HashSet<>();
        for(Integer i:nums1)s1.add(i);
        Set<Integer>s2 = new HashSet<>();
        for(Integer i:nums2)s2.add(i);
        s1.retainAll(s2);
        return s1.toArray();
    }
    public static void main(String[] args) {
        int[]nums1 = {1,2,2,1};
        int[]nums2 = {1,2};
        Object[]res = solve(nums1, nums2);
        for(Object i:res){
            System.out.print(i+" ");
        }
    }
}
