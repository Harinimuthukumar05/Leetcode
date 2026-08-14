class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int[] freq=new int[26];
        int left=0;
        int maxLen=0;
        for(int right=0;right<n;right++){
            freq[s.charAt(right)-'a']++;
            while(freq[s.charAt(right)-'a']>2){
                int leftIndex=s.charAt(left)-'a';
                freq[leftIndex]--;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);

        }
        return maxLen;
    }
}