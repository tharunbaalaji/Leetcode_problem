class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int n:weights)
        {
            left=Math.max(left,n);
            right+=n;
        }
        int ans=right;
        while(left<=right)
        {
            int mid=(left+right)/2;
            int reqDay=1;
            int currentload=0;
            for(int n:weights)
            {
                if(currentload+n>mid)
                {
                    reqDay++;
                    currentload=n;
                }
                else
                {
                    currentload+=n;
                }
            }
            if(reqDay<=days)
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