class Solution {
    public int maxDepth(String s) {
        Stack<Integer> st=new Stack<>();
        int d=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')st.push(i);
            else if(s.charAt(i)==')'){
                d=Math.max(d,st.size());
                st.pop();
            }
        }
        return d;
    }
}