class Solution {
    public String longestPalindrome(String str) {
        if(str.length()<=1)
        {
            return str;
        }
        String LPS="";
        for(int i=1;i<str.length();i++)
        {
            int left=i;
            int right=i;
            while(str.charAt(left)==str.charAt(right))
            {
                left--;
                right++;
                if(left==-1 || right==str.length())
                {
                    break;
                }
            }
            String palindrome=str.substring(left+1,right);
            if(palindrome.length()>LPS.length())
            {
                LPS=palindrome;
            }
             left=i-1;
            right=i;
            while(str.charAt(left)==str.charAt(right))
            {
                left--;
                right++;
                if(left==-1 || right==str.length())
                {
                    break;
                }
            }
            palindrome=str.substring(left+1,right);
            if(palindrome.length()>LPS.length())
            {
                LPS=palindrome;
            }
        }
        return LPS;
        
    }
}