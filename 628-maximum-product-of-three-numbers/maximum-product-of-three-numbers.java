class Solution {
    public int maximumProduct(int[] nums) {

       
        Arrays.sort(nums);
        int len = nums.length;
        // for(int i = 0; i < nums.length; i++)
        // {
        //     for(int j = i + 1; j < nums.length; j++)
        //     {
        //        product_max =  nums[i] * nums[j];
        //     }
           
        // }
        int max1 = nums[0]*nums[1]*nums[len- 1];
        int max2 = nums[len - 1]*nums[len - 2]*nums[len - 3];
         return Math.max(max1,max2);
    }
}