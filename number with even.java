1295. Find Numbers with Even Number of Digits
  int count = 0;
        for(int num : nums)
        {
            int digits = (int)(Math.log10(num)+1);
            if(digits % 2 == 0)
            count++;
        }
        return count;
				
T.C -  0ms