class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Brute force solution
        // int len = nums.length;
        // for(int i = 0; i < len; i++)
        // {
        //     for(int j = i+1; j < len; j++)
        //     {
        //         if(nums[i] + nums[j] == target)
        //         {
        //               return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int [] {};

        //Better solution using hash Map
        int len = nums.length;
        int result[] = new int[2];
        //set the index 1,0 to -1 initially!
        result[0] = result[1] = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++)
        {
            int num = nums[i];
            int needed = target - num;
            if(map.containsKey(needed))
            {
                result[0] = map.get(needed);
                result[1] = i;
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}