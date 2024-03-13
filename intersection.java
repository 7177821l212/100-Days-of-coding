
//interswction of two arrays:
//pesudo code:

Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++)
        {
            set.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++)
        {
            if(set.contains(nums2[i]))
            {
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
      
         return list.stream().mapToInt(x->x).toArray(); 