class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int idx=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')st.push(i);
            if(s.charAt(i)==')' && !st.isEmpty()){
                idx=st.pop();
            }
            if(st.isEmpty()){
                sb.append(s.substring(idx+1,i));
            }
        }
        return sb.toString();
    }
}