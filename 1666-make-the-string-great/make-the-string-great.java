class Solution {
    public String makeGood(String s) {
        if(s.length()==1)return s;
        Stack<Integer> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && Math.abs(ch-s.charAt(st.peek()))==32){
                st.pop();
            }
            else{
                st.push(i);
            }
        }
        for(int i:st){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}