class Solution {
    public int hammingWeight(int n) {
        String binary = " ";
        int count = 0;
        while(n > 0)
        {
            binary = (n % 2) + binary;
            n/=2; 
        }
        for(int i = 0; i < binary.length(); i++)
        {
            if(binary.charAt(i) == '1')
            {
                 count++;
            }
        }
        return count;
    }
}