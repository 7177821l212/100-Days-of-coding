//pesudocode

2540. Minimum Common Value 
      int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i] == nums2[j])
            {
                return nums1[i];
            }
            else if(nums1[i] < nums2[j])
            {
                i++;
            }
            else j++;
        }
        return 0;
T.C - 2ms

//Hashset approach:
       HashSet<Integer> set = new HashSet<>();
       for(int  num : nums1)
       {
        set.add(num);
       }
       for(int num : nums2)
       {
        if(set.contains(num))
        {
            return num;
        }
       }
       return 0;
T.C - 14ms