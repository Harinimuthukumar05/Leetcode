class Solution {
    public int longestValidParentheses(String s) {
        if(s.length()==0)return 0;
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int maxlen=0;
        int len=0;
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='(')stack.push(i);
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    len=i-stack.peek();
                    maxlen=Math.max(len,maxlen);
                }
            }
        }
        return maxlen;
    }
}