package Week_1.Day5;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").  toLowerCase();

        if (s.isEmpty()) 
            return true;

        String reversed = new StringBuilder(s).reverse().toString();

        if (s.equals(reversed))
            return true;
        else{
            return false;
        }   
    }
}
