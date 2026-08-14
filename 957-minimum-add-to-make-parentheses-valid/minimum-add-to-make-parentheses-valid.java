class Solution {
    public int minAddToMakeValid(String s) {
        if(s.length()==0)return 0;
        Stack<Integer> st=new Stack<>();
        int x=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')st.push(i);
            else if(ch==')'){
                if(!st.isEmpty())st.pop();
                else{
                    x++;
                }
            }
        }
        return st.size()+x;
    }
}