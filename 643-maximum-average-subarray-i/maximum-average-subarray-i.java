class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int sum=0;
        for(int right=0;right<k;right++)
        {
            sum+=nums[right];
        }
        int maxsum=sum;
        for(int right=k;right<nums.length;right++)
        {
            sum+=nums[right];
            sum-=nums[left];
            left++;
            maxsum=Math.max(sum,maxsum);
        }
        return (double)maxsum/k;
    }
}