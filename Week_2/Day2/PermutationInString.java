package Week_2.Day2;

import java.util.Arrays;

public class PermutationInString {
    
     public boolean checkInclusion(String s1, String s2) {
    
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String sortedS1 = new String(arr1);

        for(int i = 0; i <= s2.length() - s1.length(); i++) {

            String sub = s2.substring(i, i + s1.length());

            char[] arr2 = sub.toCharArray();
            Arrays.sort(arr2);

            if(sortedS1.equals(new String(arr2))) {
                return true;
            }
        }

        return false;
    }
}
