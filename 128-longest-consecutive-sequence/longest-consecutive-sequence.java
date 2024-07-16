class Solution {
    //FOR THIS CODE TLE!!
    // public static boolean linear (int[] nums,int num)
    // {   int len = nums.length;
    //     for(int i = 0; i < len; i++)
    //     {
    //         if(nums[i] == num)
    //         {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public int longestConsecutive(int[] nums) {
        // int len = nums.length;
        // int longest = 1;
        // if(len == 0)return 0;
        // for(int i = 0; i < len; i++)
        // {
        //     int x = nums[i];
        //     int count = 1;
        //     while(linear(nums,x+1) == true)
        //     {
        //         x+=1;
        //         count+=1;
        //     }
        //     longest = Math.max(longest,count);
        // }
        // return longest;
        

        //BETTER APPROACH

        int len = nums.length;
        if(len == 0) return 0;
        Arrays.sort(nums);
        int next_smaller = Integer.MIN_VALUE;
        int longest = 1;
        int count = 0;
        for(int i = 0; i < len; i++)
        {
            if(nums[i] - 1 == next_smaller){
            count+= 1;
            next_smaller = nums[i];}
            else if(nums[i] != next_smaller){
                count = 1;
                next_smaller = nums[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;

    }
}