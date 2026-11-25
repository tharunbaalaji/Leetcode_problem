class Solution {
    public int lengthOfLongestSubstring(String s) {
       int len=0;
       Set<Character>charset=new HashSet<>();
       int left=0;
       for(int right=0;right<s.length();right++)
       {
         while(charset.contains(s.charAt(right)))
         {
           charset.remove(s.charAt(left));
           left++;
         }


        charset.add(s.charAt(right));
        len=Math.max(len,right-left+1);
       }
       return len;
    }
}