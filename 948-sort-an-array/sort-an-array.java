class Solution {
    public int[] sortArray(int[] nums) {
       
        mergesort(nums,0,nums.length-1);
        return nums;
        
    }
    public static void mergesort(int[]nums,int start,int end)
    {
        if(start>=end)
        {
            return;
        }
       int mid=(start+end)/2;
       mergesort(nums,start,mid);
       mergesort(nums,mid+1,end);
       merge(nums,start,mid,end);

    }
    public static void merge(int[]nums,int start,int mid,int end)
    {
       int i=start;
       int j=mid+1;
       int k=0;
       int[]temp=new int[end-start+1];
       while(i<=mid&& j<=end)
       {
         if(nums[i]<nums[j])
         {
            temp[k]=nums[i];
            k++;
            i++;
         }
         else
         {
            temp[k]=nums[j];
            k++;
            j++;
         }
       }
       while(i<=mid)
       {
        temp[k]=nums[i];
        k++;
        i++;

       }
       while(j<=end)
       {
        temp[k]=nums[j];
        k++;
        j++;
       }
       for(int itr=0;itr<temp.length;itr++)
       {
        nums[start+itr]=temp[itr];
       }
    }
}