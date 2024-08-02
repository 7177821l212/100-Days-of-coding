class Solution {
    public int minSwaps(int[] nums) {
        int one_count = 0;
        int len = nums.length;
        for(int num : nums)
        {
            if(num == 1)
            one_count++;
        }
        if(one_count <= 1)
        return 0;
        int min_swap = Integer.MAX_VALUE;
        int window_sum = 0;
        for(int i = 0; i < one_count; i++)
        { 
            window_sum+= nums[i];
           
        }
         min_swap = one_count - window_sum;
         //Moving the window
         for(int i = 1; i <= len; i++)
         {
            window_sum-= nums[i - 1];
            window_sum+= nums[(i + one_count - 1 ) % len];
            int swap = one_count - window_sum; 
            min_swap = Math.min(min_swap,swap);
         }
         return min_swap;

    }
}