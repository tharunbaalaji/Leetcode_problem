class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][]result=new int[n][n];
        for(int j=0;j<n;j++)
        {
            int k=0;
            for(int i=n-1;i>=0;i--)
            {
                result[j][k]=matrix[i][j];
                k++;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=result[i][j];
            }
        }
        
    }
}