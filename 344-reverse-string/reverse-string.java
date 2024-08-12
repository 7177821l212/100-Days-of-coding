class Solution {
    public void reverseString(char[] s) {
        // for(int i = s.length; i >= 0; i--)
        // {
        //     System.out.print(s[i]);
        // }
        int left = 0;
        int right = s.length - 1;
        while( left < right)
        {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
            
        }
    }
}