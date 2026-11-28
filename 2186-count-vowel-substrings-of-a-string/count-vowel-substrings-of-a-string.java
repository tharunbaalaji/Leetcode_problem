class Solution {
    public int countVowelSubstrings(String word) {
        int count=0;
        
        for(int left=0;left<word.length();left++)
        {
            Map<Character,Integer>map=new HashMap<>();
            for(int right=left;right<word.length();right++)
            {
                if(word.charAt(right)=='a'||word.charAt(right)=='e'||word.charAt(right)=='i'||word.charAt(right)=='o'||word.charAt(right)=='u')
                {
                    map.put(word.charAt(right),map.getOrDefault(word.charAt(right),0)+1);
                    if(map.size()==5)
                    {
                        count++;
                    }
                }
                else
                {
                    break;
                }
            }
           
        }
         return count;
    }
}