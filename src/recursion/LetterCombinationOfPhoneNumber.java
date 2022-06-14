package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumber {
    public static List<String> solve(String digits) {
        List<String>res = new ArrayList<>();
        Map<Character,String>map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        for (int i = 0; i < map.size(); i++) {
            String ch = map.get(digits.charAt(0));
            StringBuilder s = new StringBuilder("");
            s.append(ch);
            res.add(s.toString());
        }
        for (int i = 0; i < digits.length(); i++) {
            List<String>temp = res;
            res.clear();

        }

        return res;
    }
}
