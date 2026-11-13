class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length)
        {
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int n:bloomDay)
        {
            min=Math.min(min,n);
            max=Math.max(max,n);
        }
        int left=min;
        int right=max;
        int ans=0;
        while(left<=right)
        {
            int mid=(left+right)/2;
            int flower=0;
            int boq=0;
            for(int n:bloomDay)
            {
                if(n<=mid)
                {
                    flower++;
                    if(flower==k)
                    {
                        boq++;
                        flower=0;
                    }
                }
                else
                {
                    flower=0;
                }
            }
            if(boq>=m)
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