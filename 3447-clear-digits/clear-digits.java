class Solution {
    public String clearDigits(String s) {
        Stack<Integer> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                st.push(i);
            }
            else if(Character.isDigit(s.charAt(i))){
                if(!st.isEmpty())st.pop();
            }
        }
        for (int i : st) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}