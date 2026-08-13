class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int high=letters.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            char ch=letters[mid];
            if(ch>target){
                ans=Math.min(mid,ans);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans!=Integer.MAX_VALUE?letters[ans]:letters[0];
    }
}