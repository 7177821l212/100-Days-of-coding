class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //Brute force solution
        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        for(int i = 0; i < len; i++)
        {     int count = 0;
        if(list.size() == 0 || list.get(0) != nums[i]){
           for(int  j = 0; j < len; j++) 
           if(nums[j] == nums[i])
                count++;
        }
                if(count > (len / 3))
                list.add(nums[i]);
                if(list.size() == 2)break;
        }
        return list;
    }
}