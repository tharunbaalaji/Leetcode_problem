class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                map.put('I',1);
            }
            else if(s.charAt(i)=='V')
            {
                map.put('V',5);
            }
             else if(s.charAt(i)=='X')
            {
                map.put('X',10);
            }
             else if(s.charAt(i)=='L')
            {
                map.put('L',50);
            }
             else if(s.charAt(i)=='C')
            {
                map.put('C',100);
            }
             else if(s.charAt(i)=='D')
            {
                map.put('D',500);
            }
             else if(s.charAt(i)=='M')
            {
                map.put('M',1000);
            }
        }
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()-1&&map.get(s.charAt(i))<map.get(s.charAt(i+1)))
            {
                sum-=map.get(s.charAt(i));
            }
            else
            {
                sum+=map.get(s.charAt(i));
            }
        }
        return sum;
        
    }
}