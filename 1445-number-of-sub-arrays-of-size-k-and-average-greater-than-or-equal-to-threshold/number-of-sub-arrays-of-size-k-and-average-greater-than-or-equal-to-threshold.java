class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0;
        int sum=0;
        int target=k*threshold;
        int count=0;
        for(int right=0;right<k;right++)
        {
            sum+=arr[right];
        }
        if(sum>=target)
        {
            count++;
        }
        for(int right=k;right<arr.length;right++)
        {
            sum+=arr[right];
            sum-=arr[left];
            left++;
            if(sum>=target)
            {
                count++;
            }
        }
        return count;
           
    }
}