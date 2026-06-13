package Week_2.Day2;

import java.util.*;

public class FindAllAnagramsinaString {

     public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        char[] arr = p.toCharArray();
        Arrays.sort(arr);
        String sortedP = new String(arr);

        for (int i = 0; i <= s.length() - p.length(); i++) {
            String sub = s.substring(i, i + p.length());

            char[] temp = sub.toCharArray();
            Arrays.sort(temp);

            if (sortedP.equals(new String(temp))) {
                ans.add(i);
            }
        }

        return ans;
    }
}
   
