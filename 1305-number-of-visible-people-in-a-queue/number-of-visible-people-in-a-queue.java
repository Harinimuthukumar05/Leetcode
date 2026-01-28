class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int count=0;
            while(!st.isEmpty()&&heights[i]>st.peek()){
                count++;
                st.pop();
            }
            if(!st.isEmpty()){
                count++;
            }
            st.push(heights[i]);
            ans[i]=count;
        }
        return ans;
    }
}