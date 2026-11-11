class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int n:piles)
        {
            right=Math.max(right,n);
        }
        int ans=0;
        while(left<=right)
        {
            int mid=(left+right)/2;
            long sum=0;
            for(int n:piles)
            {
               sum+=(n+(mid-1L))/mid;
            }
            if(sum<=h)
            {
                ans=mid;
                right=mid-1;
            }
            else 
            {
                left=mid+1;
            }
           
        }
        return ans;
        
    }
}