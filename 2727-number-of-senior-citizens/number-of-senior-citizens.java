class Solution {
    public int countSeniors(String[] details) {
        // int len = details.length;
        // for(int i = 0; i < len; i++)
        // {
        //     while(details[i])
        // }
        int result = 0;
        for(String num : details)
        {
             int age = Integer.parseInt(num.substring(11,13));
             if(age > 60)
             result++;
        }
        return result;
    }
}