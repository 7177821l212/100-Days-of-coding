class Solution {
    public String reverseParentheses(String s) {
        Deque<Integer> stack = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                stack.push(result.length());
            }
            else if(ch == ')')
            {
                int start_idx = stack.pop();
                String reverse = new StringBuilder(result.substring(start_idx)).reverse().toString();
                result.replace(start_idx,result.length(),reverse);
            }
            else
            {
                result.append(ch);
            }
        }
        return result.toString();
    }
}