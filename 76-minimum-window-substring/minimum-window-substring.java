class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
        {
            return "";
        }
        Map<Character,Integer>map=new HashMap<>();
        for(char c:t.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int left=0;
        int minlen=Integer.MAX_VALUE;
        int count=0;
        int start=0;
        for(int right=0;right<s.length();right++)
        {
            if(map.containsKey(s.charAt(right)))
            {
                if(map.get(s.charAt(right))>0)
                {
                    count++;
                }
            }
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)-1);
          while(count==t.length())
          {
            if(minlen>right-left+1)
            {
                minlen=right-left+1;
                start=left;
            }
            if(map.containsKey(s.charAt(left)))
            {
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)+1);
                if(map.get(s.charAt(left))>0)
                {
                    count--;
                }
            }
            left++;
          }
        }
        if(minlen==Integer.MAX_VALUE)
        {
            return "";
        }
        return s.substring(start,start+minlen);
    }
}