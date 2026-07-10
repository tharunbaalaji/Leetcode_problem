class Solution {
    public boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int left=0;
        int sum=0;
        int count=0;
        for(int right=0;right<k;right++)
        {
            if(isVowel(s.charAt(right)))
            {
                count++;
            }
        }
        int max=count;
        for(int right=k;right<s.length();right++)
        {
            if(isVowel(s.charAt(right)))
            {
                count++;
            }
            if(isVowel(s.charAt(left)))
            {
                count--;
                
            }
            left++;
            max=Math.max(max,count);
            
        }
        return max;
        
    }
}