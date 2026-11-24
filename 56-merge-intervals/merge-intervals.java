class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
       
        int i=0;
        List<int[]>list=new ArrayList<>();
        while(i<intervals.length)
        {
            int[]arr=intervals[i];
            i++;

        while(i<intervals.length && intervals[i][0]<=arr[1])
        {
            arr[0]=Math.min(intervals[i][0],arr[0]);
            arr[1]=Math.max(intervals[i][1],arr[1]);
            i++;
        }
        list.add(arr);
        }
       
        return list.toArray(new int[list.size()][]);

        
    }
}