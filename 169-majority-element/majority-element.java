class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int l=nums.length/2;
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.get(n)>l)
            {
                return n;
            }
        }
        return -1;

        
    }
}