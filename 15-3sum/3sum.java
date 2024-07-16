class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Set of List
        Set<List<Integer>> list = new HashSet<>();
        int len = nums.length;
        for(int i = 0; i < len; i++)
        {
            Set<Integer> set = new HashSet<>();
            for(int j = i + 1; j < len; j++)
            {
                int third_num = -(nums[i] + nums[j]); 
                if(set.contains(third_num))
                {
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],third_num);
                    temp.sort(null);
                    list.add(temp);
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>> result = new ArrayList<>(list);
        return result;
    }
}