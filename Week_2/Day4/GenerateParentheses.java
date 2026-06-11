package Week_2.Day4;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        print(0 ,0 , n , "");
    }
    
    public static void print(int open , int close , int n , String s){
        if(s.length() == 2 * n){
            System.out.println(s);
            return ;
        }
        
        if(open < n) print(open + 1 , close , n , s + "(");

        if(close < open) print(open , close + 1 , n , s + ")");

    }
}

