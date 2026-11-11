class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        Set<Integer>set=new HashSet<>();
        for(int n:arr)
        {
            set.add(n);
        }
        for(int i=1; ;i++)
        {
           if(!set.contains(i))
           {
             count++;
           }
           if(count==k)
           {
             return i;
           }
        }
        
        
        
    }
}