class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int l1=nums.length;
        int l=l1/3;
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer>list=new ArrayList<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
           
        }
        for(int key:map.keySet())
           {
             if(map.get(key)>l)
             {
                list.add(key);
             }
           }
        return list;

        
    }
}