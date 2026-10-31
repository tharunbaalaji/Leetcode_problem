class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[]c=new int[nums.length];
        int j=0;
        int k=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                c[j]=nums[i];
                j+=2;
            }
            else
            {
                c[k]=nums[i];
                k+=2;
            }
        }
        return c;
        
    }
}