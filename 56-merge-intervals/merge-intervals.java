class Solution {
    public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
    List<int[]> list = new ArrayList<>();
    for(int nums[] : intervals)
    {
        if(list.size() == 0)
            list.add(nums);
        else
        {
            int last [] = list.get(list.size() - 1);
            if(nums[0] > last[1])
            {  
                list.add(nums);
            }
            else
            {
                last[1] = Math.max(last[1] ,nums[1]); 
            }
        }
    }
    return list.toArray(new int[list.size()] [2]);
    }
}