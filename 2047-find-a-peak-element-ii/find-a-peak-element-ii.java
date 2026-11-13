class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int left=0;
        int right=col-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            int max=0;
            for(int i=0;i<row;i++)
            {
                if(mat[i][mid]>mat[max][mid])
                {
                    max=i;
                }
            }
            int curr=mat[max][mid];
            int leftval=(mid>0)?mat[max][mid-1]:-1;
            int rightval=(mid<col-1)?mat[max][mid+1]:-1;
            if(curr>leftval && curr>rightval)
            {
                return new int[]{max,mid};
            }
            else if(leftval>curr)
            {
                right=mid-1;
            }
            else 
            {
                left=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}