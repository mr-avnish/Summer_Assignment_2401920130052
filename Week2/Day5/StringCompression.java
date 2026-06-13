package Week_2.Day5;

public class StringCompression {

    public int compress(char[] chars) {
        
        int i = 0 ;
        int j = 0 ;

        String ans = "";

                while(j < chars.length){
                if(chars[i] == chars[j]){
                    j++ ;
                }
                else {
                    int len = j - i;
                    ans += chars[i];
                    if(len > 1) ans += len;
                    i = j ;
                }
            }
            int len = j - i;
            ans += chars[i];
             if(len > 1) ans += len;

        for(i = 0 ; i < ans.length(); i++){
            chars[i]  = ans.charAt(i);
        }       
            return ans.length();  
    }
}
