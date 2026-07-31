class Solution {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        boolean found=false;
        int index=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==target)
            {
                index=i;
                found=true;
                break;
            }
        }
        if(found==true)
        {
            return index;
        }
        if(found==false)
        {
        if(target>nums[len-1])
        {
            return len;
        }
        int[]arr=new int[len+1];
        int num=0;
        for(int i=0;i<len;i++)
        {
             num=nums[i];
             arr[i]=num;
        }
        arr[len]=target;
        Arrays.sort(arr);
        for(int i=0;i<len+1;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        }
        return 0;
    }
}